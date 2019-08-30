package com.project.entities;

public class InStock {

	private Dvd dvd;
	private int nbDvd;
	
	public InStock(Dvd dvd, int nbDvd) {
		super();
		this.dvd = dvd;
		this.nbDvd = nbDvd;
	}

	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}

	public int getNbDvd() {
		return nbDvd;
	}

	public void setNbDvd(int nbDvd) {
		this.nbDvd = nbDvd;
	}
	
	
	
}
