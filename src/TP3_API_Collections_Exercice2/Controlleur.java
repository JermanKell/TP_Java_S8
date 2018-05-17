package TP3_API_Collections_Exercice2;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	public static void AjouterElement(ArrayList<ArrayList<Integer>> list, int element, Scanner sc) {
		System.out.println("Veuillez saisir la position de l'ensemble à modifier:");
		int position = sc.nextInt();
		
		if (position < 0)	throw new IndexOutOfBoundsException("La position données n'est pas correcte");
		else if (position > list.size()-1)	throw new IndexOutOfBoundsException("La position donnée n'est pas correcte");
				
		GestionListe.AjouterElement(list.get(position), element);
	}
	
	public static void AfficherContenuEnsemble(ArrayList<ArrayList<Integer>> liste, Scanner sc) {
		System.out.println("Veuillez saisir la position de l'ensemble à afficher:");
		int position = sc.nextInt();
		
		if (position < 0)	throw new IndexOutOfBoundsException("La position données n'est pas correcte");
		else if (position > liste.size()-1)	throw new IndexOutOfBoundsException("La position donnée n'est pas correcte");
		
		ArrayList<Integer> list = liste.get(position);
		
		GestionListe.AfficherContenuEnsemble(list);
	}
	
	public static void CalculUnionEnsemble(ArrayList<ArrayList<Integer>> liste, Scanner sc) {
		int boucle = 0;
		int position = 0;
		ArrayList<Integer> ens1 = null;
		ArrayList<Integer> ens2 = null;
		
		while (boucle < 2) {
			System.out.println("Veuillez taper la position de l'ensemble à comparer:");
			position = sc.nextInt();
			
			if (position < 0)	throw new IndexOutOfBoundsException("La position données n'est pas correcte");
			else if (position > liste.size()-1)	throw new IndexOutOfBoundsException("La position donnée n'est pas correcte");
			
			if (position == 0)	ens1 = liste.get(position);
			else ens2 = liste.get(position);
			
			boucle++;
		}
		
		ArrayList<Integer> list = GestionListe.CalculUnionEnsembles(ens1, ens2);
		liste.add(list);
	}
	
	
}
