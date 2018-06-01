package TP5_Pattern_Composite_Exercice2;

import java.util.ArrayList;

public class Lot implements Article{
	private ArrayList<Article> liste = null;
	private String marque = null;
	private String nom = null;
	private int quantite = 0;
	private int PouReduc = 0;
	private double prix = 0;
	
	public Lot(ArrayList<Article> article, int pourcentage) {
		liste = article;
		quantite = liste.size();
		PouReduc = pourcentage;
	}
	
	@Override
	public String getNom() {
		nom = "Lot de " + liste.size() + " " + liste.get(1).getNom();
		return nom;
	}

	@Override
	public String getMarque() {
		marque = liste.get(1).getMarque();
		return marque;
	}

	@Override
	public double getPrix() {
		prix = quantite*liste.get(1).getPrix()*((100-PouReduc)/100);
		return prix;
	}

}
