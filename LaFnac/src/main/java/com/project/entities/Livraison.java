package com.project.entities;

public class Livraison {

	private Panier panier;
	private String type;
	private int prixTotal;
	
	public Livraison(Panier panier, String type, int prixTotal) {
		super();
		this.panier = panier;
		this.type = type;
		this.prixTotal = prixTotal;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(int prixTotal) {
		this.prixTotal = prixTotal;
	}
	
}
