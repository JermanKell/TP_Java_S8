package TP4_Collections_String;

import java.util.LinkedList;

public class GestionListe {
	
	public static LinkedList<String> CreerNvlListe() {
		LinkedList<String> liste = new LinkedList<String>();
		
		return liste;
	}
	
	public static void AjouterElement(LinkedList<String> liste, String element) {
		liste.add(element);
		System.out.println("L'element " + element + " a bien ete ajoute");
	}
	
	public static void AjouterElement(LinkedList<String> liste, String[] element) {
		for (String str : element) {
			liste.add(str);
		}
		System.out.println("Tous les elements présents dans le tableau ont ete ajoutes");
	}
	
	public static void AfficherElements(LinkedList<String> liste) {
		System.out.println("Voici les elements presents dans la liste:");
		for (String str : liste) {
			System.out.println("\t- " + str);
		}
	}
	
	

}
