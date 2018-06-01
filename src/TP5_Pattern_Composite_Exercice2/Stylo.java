package TP5_Pattern_Composite_Exercice2;

public class Stylo implements Article{
	private String nomP = null;
	private String marque = null;
	private double prix = 0;
	private String couleur = null;
	
	public Stylo(String nom, String marque, double prix, String c) {
		nomP = nom;
		this.marque = marque;
		this.prix = prix;
		couleur = c;
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
	public String getCouleur() {
		return couleur;
	}	
}
