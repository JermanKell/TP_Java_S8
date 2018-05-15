package TP3_API_Collections_Exercice2;

import java.util.ArrayList;

public class Controlleur {
	public static void creerSingleton(ArrayList<ArrayList<Integer>> list, int element) {
		if (element < 0)	throw new IllegalArgumentException("L'element passe en param est negatif");
		ArrayList<Integer> liste = GestionListe.creerSingleton(element);
		
		if (list.size() != 0) {
			for (ArrayList<Integer> List : list) {
				if (liste.hashCode() == List.hashCode()) throw new IllegalArgumentException("Une liste avec ce seul element existe déjà");
			}
		}
		else list.add(liste);		
	}
	
	
}
