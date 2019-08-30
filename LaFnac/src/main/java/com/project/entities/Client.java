package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String password;
	
	
	public Client(String nom, String prenom, String adresse, String mail, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.password = password;
	}
	public Client() {
		super();
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
