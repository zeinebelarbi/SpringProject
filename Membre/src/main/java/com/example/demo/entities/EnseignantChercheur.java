package com.example.demo.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;




@Entity
@DiscriminatorValue("ens") 
public class EnseignantChercheur extends Membre {
	private String grade;
	private String etablissement;
	@OneToMany (mappedBy="encadrant")
	Collection <Etudiant> entudiants;
	public EnseignantChercheur() {
		super();
	
	}
	public EnseignantChercheur(String cin, String nom, String prenom, Date date, byte[] photo, String cv, String email,
			String password, String grade, String etablissement) {
		super(cin, nom, prenom, date, photo, cv, email, password);
		this.grade = grade;
		this.etablissement = etablissement;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	
}
