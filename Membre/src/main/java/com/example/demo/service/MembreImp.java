package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EnseignantChercheurRepository;
import com.example.demo.dao.EtudiantRepository;
import com.example.demo.dao.MembreRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

@Service
public class MembreImp implements ImembreService {
	
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	MembreRepository membreRepository;
	@Autowired
	EnseignantChercheurRepository enseignantChercheurRepository;
	@Override
	public Membre addMember(Membre m) {
		// TODO Auto-generated method stub
		return membreRepository.save(m) ;
	}

	@Override
	public void deleteMember(Long id) {
		// TODO Auto-generated method stub
		membreRepository.deleteById(id);
	}

	@Override
	public Membre updateMember(Membre p) {
		// TODO Auto-generated method stub
		return membreRepository.saveAndFlush(p);
	}

	@Override
	public Membre findMember(Long id) {
		// TODO Auto-generated method stub
		return  membreRepository.findById(id).get();
	}

	@Override
	public List<Membre> findAll() {
		// TODO Auto-generated method stub
		return membreRepository.findAll() ;
	}

	@Override
	public Membre findByCin(String cin) {
		// TODO Auto-generated method stub
		return membreRepository.findByCin(cin) ;
	}

	@Override
	public Membre findByEmail(String email) {
		// TODO Auto-generated method stub
		return membreRepository.findByEmail(email);
	}

	@Override
	public List<Membre> findByNom(String nom) {
		// TODO Auto-generated method stub
		return membreRepository.findByNomStartingWith(nom) ;
	}

	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		// TODO Auto-generated method stub
		return membreRepository.findByDiplome(diplome);
	}

	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		// TODO Auto-generated method stub
		return enseignantChercheurRepository.findByGrade(grade);
	}

	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		// TODO Auto-generated method stub
		return enseignantChercheurRepository.findByEtablissement(etablissement) ;
	}
	@Override
	public void affect_Etudiant_to_Enseignant(Long idEtd,Long idEns) {
		Etudiant e =etudiantRepository.findById(idEtd).get();
		EnseignantChercheur ens=enseignantChercheurRepository.findById(idEns).get();
		e.setEncadrant(ens);
		etudiantRepository.save(e);
		
}


}
