package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Membre;

import antlr.collections.List;
@Repository
public interface MembreRepository extends JpaRepository<Membre,Long> {
	Membre findByCin(String cin);
	java.util.List<Membre>findByNomStartingWith(String caractere);
	Membre findByEmail(String email);
	java.util.List<Etudiant> findByDiplome(String diplome);
}
