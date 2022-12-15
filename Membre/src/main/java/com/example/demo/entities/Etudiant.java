package com.example.demo.entities;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
@DiscriminatorValue("etd") 
public class Etudiant extends Membre {
	private Date dateInscription;
	private String diplome;
	@ManyToOne
	private EnseignantChercheur encadrant;
	
	public Etudiant() {
		super();
	}

	public Etudiant(String cin, String nom, String prenom, Date date, byte[] photo, String cv, String email,
			String password, Date dateinscription, String diplome) {
		super(cin, nom, prenom, date, photo, cv, email, password);
		this.dateInscription = dateinscription;
		this.diplome = diplome;
	}

	
	public Date getDateinscription() {
		return dateInscription;
	}
	public void setDateinscription(Date dateinscription) {
		this.dateInscription = dateinscription;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public EnseignantChercheur getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(EnseignantChercheur encadrant) {
		this.encadrant = encadrant;
	}

	
	
}
