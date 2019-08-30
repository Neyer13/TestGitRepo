package com.project.entities;

public class Panier {

	private Stock stock;
	private int prixPanier;
	
	public Panier(Stock stock, int prixPanier) {
		super();
		this.stock = stock;
		this.prixPanier = prixPanier;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public int getPrixPanier() {
		return prixPanier;
	}

	public void setPrixPanier(int prixPanier) {
		this.prixPanier = prixPanier;
	}
		
}
