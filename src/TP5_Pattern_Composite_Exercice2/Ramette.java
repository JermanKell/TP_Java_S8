package TP5_Pattern_Composite_Exercice2;

public class Ramette implements Article{
	private String nomP = null;
	private String marque = null;
	private double prix = 0;
	private String grammage = null;
	
	public Ramette(String nom, String marque, double prix, String densite) {
		nomP = nom;
		this.marque = marque;
		this.prix = prix;
		grammage = densite;
	}

	@Override
	public String getNom() {
		return nomP;
	}

	@Override
	public String getMarque() {
		return marque;
	}

	@Override
	public double getPrix() {
		return prix;
	}
	
	public String grammage() {
		return grammage;
	}
	
}
