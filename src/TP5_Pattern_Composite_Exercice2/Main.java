package TP5_Pattern_Composite_Exercice2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Lot> tabLots = new ArrayList<Lot>();
		ArrayList<Article> liste = new ArrayList<Article>();
		
		for (int i = 0; i < 20; i++) {
			liste.add(new Stylo("stylo noir B2", "Reynolds", 5.25, "Jaune"));
		}
		Lot lot1 = new Lot(liste, 25);
		tabLots.add(lot1);
		
		liste.clear();
		
		for (int i = 0; i < 35; i++) {
			liste.add(new Ramette("Papier A4 80g", "Clairefontaine", 10.5, "80 g/m²"));
		}
		Lot lot2 = new Lot(liste, 50);
		tabLots.add(lot2);
		
		liste.clear();
		
		for (Lot lot : tabLots) {
			System.out.println("Il s'agit d'un lot de " + lot.getNom() + " dont le fabricant est "
					+ lot.getMarque() + " .");
			System.out.println("Le prix de ce lot est de " + lot.getPrix() + "€.");
		}
	}

}
