package TP3_API_Collections_Exercice2;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlleur {
	/**
	 * Liste contenant toutes les listes créées
	 */
	private static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
	/**
	 * Créé un singleton et le stocke après
	 * @param sc		Objet scanner
	 */
	public static void creerSingleton(Scanner sc) {
		int element;
		
		System.out.println("Quel element souhaitez-vous ajouter ?");
		element = sc.nextInt();
		if (!(element%2 == 0) || !(element%2 == 1))	throw new IllegalArgumentException("L'element passe en param n'est pas entier");
		if (element < 0)	throw new IllegalArgumentException("L'element passe en param est negatif");
		ArrayList<Integer> liste = GestionListe.creerSingleton(element);
		
		if (list.size() != 0) {
			for (ArrayList<Integer> List : list) {
				if (liste.hashCode() == List.hashCode()) throw new IllegalArgumentException("Une liste avec ce seul element existe déjà");
			}
		}
		else list.add(liste);		
	}
	
	/**
	 * Ajoute un element à un ensemble désigné par l'utilisateur
	 * @param sc	Objet scanner
	 */
	public static void AjouterElement(Scanner sc) {
		System.out.println("Veuillez saisir la position de l'ensemble à modifier:");
		int position = sc.nextInt();
		
		System.out.println("Veuillez saisir le nombre à ajouter:");
		int element = sc.nextInt();
		
		if (position < 0)	throw new ArrayIndexOutOfBoundsException("La position donnée n'est pas correcte");
		else if (position > list.size()-1)	throw new ArrayIndexOutOfBoundsException("La position donnée n'est pas correcte");

		if (!(element%2 == 0) || !(element%2 == 1))	throw new IllegalArgumentException("L'element passe en param n'est pas entier");
		if (element < 0)	throw new IllegalArgumentException("L'element passe en param est negatif");
				
		GestionListe.AjouterElement(list.get(position), element);
	}
	
	/**
	 * Affiche le contenu d'un ensemble désigné par l'utilisateur
	 * @param sc		Objet scanner
	 */
	public static void AfficherContenuEnsemble(Scanner sc) {
		System.out.println("Veuillez saisir la position de l'ensemble à afficher:");
		int position = sc.nextInt();
		
		if (position < 0)	throw new IndexOutOfBoundsException("La position données n'est pas correcte");
		else if (position > list.size()-1)	throw new IndexOutOfBoundsException("La position donnée n'est pas correcte");
		
		ArrayList<Integer> liste = list.get(position);
		
		GestionListe.AfficherContenuEnsemble(liste);
	}
	
	/**
	 * Calcule l'ensemble résultant de l'union de deux ensembles désignés par l'utilisateur et le stocke
	 * @param sc		Objet scanner
	 */
	public static void CalculUnionEnsembles(Scanner sc) {
		int boucle = 0;
		int position = 0;
		ArrayList<Integer> ens1 = null;
		ArrayList<Integer> ens2 = null;
		
		while (boucle < 2) {
			System.out.println("Veuillez taper la position de l'ensemble à comparer:");
			position = sc.nextInt();
			
			if (position < 0)	throw new IndexOutOfBoundsException("La position données n'est pas correcte");
			else if (position > list.size()-1)	throw new IndexOutOfBoundsException("La position donnée n'est pas correcte");
			
			if (position == 0)	ens1 = list.get(position);
			else ens2 = list.get(position);
			
			boucle++;
		}
		
		ArrayList<Integer> liste = GestionListe.CalculUnionEnsembles(ens1, ens2);
		list.add(liste);
	}
	
	/**
	 * Calcule l'ensemble résultatn de l'intersection de deux ensembles désignés par l'utilisateur et le stocke
	 * @param sc		Objet scanner
	 */
	public static void CalculIntersectionEnsembles(Scanner sc) {
		int boucle = 0;
		int position = 0;
		ArrayList<Integer> ens1 = null;
		ArrayList<Integer> ens2 = null;
		
		while (boucle < 2) {
			System.out.println("Veuillez taper la position de l'ensemble à comparer:");
			position = sc.nextInt();
			
			if (position < 0)	throw new IndexOutOfBoundsException("La position données n'est pas correcte");
			else if (position > list.size()-1)	throw new IndexOutOfBoundsException("La position donnée n'est pas correcte");
			
			if (position == 0)	ens1 = list.get(position);
			else ens2 = list.get(position);
			
			boucle++;
		}
		
		ArrayList<Integer> liste = GestionListe.CalculIntersectionEnsembles(ens1, ens2);
		list.add(liste);
	}
	
	/**
	 * Vérifie l'appartenance d'un élément à un ensemble désigné par l'utilisateur
	 * @param sc		Objet scanner
	 */
	public static void AppartenanceElementEnsemble(Scanner sc) {
		ArrayList<Integer> lElem = null;
		int position, element;
		boolean value;
		
		System.out.println("Veuillez saisir la position de l'ensemble à vérifier:");
		position = sc.nextInt();
		
		if (position < 0)	throw new ArrayIndexOutOfBoundsException("La position donnée n'est pas correcte");
		else if (position > list.size()-1)	throw new ArrayIndexOutOfBoundsException("La position donnée n'est pas correcte");
		
		System.out.println("Veuillez saisir le nombre à vérifier:");
		element = sc.nextInt();
		
		if (!(element%2 == 0) || !(element%2 == 1))	throw new IllegalArgumentException("L'element passe en param n'est pas entier");
		if (element < 0)	throw new IllegalArgumentException("L'element passe en param est negatif");
		
		lElem = list.get(position);
		value = GestionListe.AppartenanceElementEnsemble(lElem, element);
		if (value)	System.out.println("L'ensemble à la position " + position + " possède bien l'élément " + element);
		else System.out.println("L'ensemble à la position " + position + " ne possède pas cet élément.");
	}
	
	/**
	 * Compte le nombre d'elements présents dans un ensemble désigné par l'utilisateur
	 * @param sc		Objet scanner
	 */
	public static void ComptageElementsEnsemble(Scanner sc) {
		ArrayList<Integer> lElem = null;
		int position, tailleEns;
		
		System.out.println("Veuillez saisir la position de l'ensemble dont on doit compter la taille:");
		position = sc.nextInt();
		
		if (position < 0)	throw new ArrayIndexOutOfBoundsException("La position donnée n'est pas correcte");
		else if (position > list.size()-1)	throw new ArrayIndexOutOfBoundsException("La position donnée n'est pas correcte");
		
		lElem = list.get(position);
		tailleEns = GestionListe.ComptageElementsEnsemble(lElem);
		
		System.out.println("L'ensemble à la position " + position + " est composé de " + tailleEns + " éléments.");
	}
}
