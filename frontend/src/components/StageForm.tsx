import React, { useState, useEffect } from 'react';
import axios from 'axios';

export default function StageForm() {
  const [description, setDescription] = useState('');
  const [objectif, setObjectif] = useState('');
  const [entrepriseId, setEntrepriseId] = useState('');
  const [periodeId, setPeriodeId] = useState('');
  const [stagiaires, setStagiaires] = useState<string[]>([]);
  const [entreprises, setEntreprises] = useState<any[]>([]);
  const [periodes, setPeriodes] = useState<any[]>([]);
  const [listeStagiaires, setListeStagiaires] = useState<any[]>([]);

  // Charger les données (entreprises, périodes, stagiaires)
  useEffect(() => {
    axios.get('http://localhost:8081/api/entreprises').then(res => setEntreprises(res.data));
    axios.get('http://localhost:8081/api/periodes').then(res => setPeriodes(res.data));
    axios.get('http://localhost:8081/api/stagiaires').then(res => setListeStagiaires(res.data));
  }, []);

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    const stage = {
      description,
      objectif,
      entreprise: { id: Number(entrepriseId) },
      periode: { id: Number(periodeId) },
      stagiaire: stagiaires.map(id => ({ id: Number(id) }))
    };

    axios.post('http://localhost:8081/api/stages', stage)
      .then(() => alert('Stage ajouté avec succès !'))
      .catch(err => console.error(err));
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Ajouter un Stage</h2>

      <label>Description :</label>
      <input type="text" value={description} onChange={e => setDescription(e.target.value)} required />

      <label>Objectif :</label>
      <input type="text" value={objectif} onChange={e => setObjectif(e.target.value)} required />

      <label>Entreprise :</label>
      <select value={entrepriseId} onChange={e => setEntrepriseId(e.target.value)} required>
        <option value="">-- Choisir une entreprise --</option>
        {entreprises.map(ent => (
          <option key={ent.id} value={ent.id}>{ent.nom}</option>
        ))}
      </select>

      <label>Période :</label>
      <select value={periodeId} onChange={e => setPeriodeId(e.target.value)} required>
        <option value="">-- Choisir une période --</option>
        {periodes.map(p => (
          <option key={p.id} value={p.id}>
            {p.dateDebut} → {p.dateFin}
          </option>
        ))}
      </select>

      <label>Stagiaires :</label>
      <select multiple value={stagiaires} onChange={e => {
        const selected = Array.from(e.target.selectedOptions, option => option.value);
        setStagiaires(selected);
      }} required>
        {listeStagiaires.map(s => (
          <option key={s.id} value={s.id}>
            {s.nom} {s.prenom}
          </option>
        ))}
      </select>

      <button type="submit">Ajouter</button>
    </form>
  );
}
