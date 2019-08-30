package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEmploye;
	private int identifiant;
	private String nom;
	private String passWord;
//	private Stock stock;
//	private Facture facture;
//	private Dvd dvd;
	
	
	public Employe() {
		super();
	}

	public Employe(int identifiant, String nom, String passWord) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.passWord = passWord;
	}

	public Long getidEmploye() {
		return idEmploye;
	}

	public void setidEmploye(Long idClient) {
		this.idEmploye = idClient;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
