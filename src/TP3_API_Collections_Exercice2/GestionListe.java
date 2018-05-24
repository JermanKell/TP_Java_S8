package TP3_API_Collections_Exercice2;

import java.util.ArrayList;

public class GestionListe {
	/**
	 * Créé et renvoie le singleton avec l'element ajouté
	 * @param element	Element à ajouter au nouveau singleton
	 * @return		Ensemble à un seul element (singleton)
	 */
	public static ArrayList<Integer> creerSingleton(int element) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(element);
		return list;		
	}
	
	/**
	 * Ajoute un element à un ensemble selectionné par l'utilisateur 
	 * 		(autorisation de doublons) => pas de consignes pour le contraire
	 * @param list		Ensemble où l'element doit etre insere
	 * @param element	Element à inserer
	 */
	public static void AjouterElement(ArrayList<Integer> list, int element) {
		list.add(element);
	}
	
	/**
	 * Affiche le contenu d'un ensemble désigné
	 * @param list		Ensemble désigné
	 */
	public static void AfficherContenuEnsemble(ArrayList<Integer> list) {
		System.out.println("Le(s) valeur(s) contenue(s) dans l'ensemble:");
		for (int valeur : list) {
			System.out.println("\t- " + valeur);
		}
	}
	
	/**
	 * Calcule l'ensemble résultant de l'union des deux ensembles selectionnes
	 * @param ens1		Premier ensemble selectionné
	 * @param ens2		Seconde ensemble selectionné
	 * @return			Nouvel ensemble résultant
	 */
	public static ArrayList<Integer> CalculUnionEnsembles(ArrayList<Integer> ens1, ArrayList<Integer> ens2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int i = 0, j = 0;
		int e1 = 0, e2 = 0, position = 0, nbVal = 0, sommeVal = 0;
		
		while ((position < ens1.size()) || position < ens2.size()) {
			if (position < ens1.size())	e1 = ens1.get(position);
			if (position < ens2.size())	e2 = ens2.get(position);
			
			if (e1 == e2) {
				if (!list.contains(e1)) {
					sommeVal += e1;
					nbVal++;
					list.add(e1);
				}
			}
			else {
				if (!list.contains(e1)) {
					sommeVal += e1;
					nbVal++;
					list.add(e1);					
				}
				if (!list.contains(e2)) {
					sommeVal += e2;
					nbVal++;
					list.add(e2);
				}
			}
			
			position++;
		}
		System.out.println(nbVal + " elements sont communs à ces deux ensembles." 
				+ "\nLa somme de ces éléments donne " + sommeVal);
		System.out.println("Le resultat de l'union de ces deux ensembles est:");
		AfficherContenuEnsemble(list);
		
		return list;
	}
		
	/**
	 * Calcule l'ensemble résultant de l'intersection des deux ensembles selectionnes
	 * @param ens1		Premier ensemble selectionné
	 * @param ens2		Seconde ensemble selectionné
	 * @return			Nouvel ensemble résultant
	 */
	public static ArrayList<Integer> CalculIntersectionEnsembles(ArrayList<Integer> ens1, ArrayList<Integer> ens2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int element;
		int nbElementCom = 0, sommeVal = 0, position = 0;
		boolean flag = true;
		int i, j;
		
		for (i = 0; i < ens1.size(); i++) {
			for (j = 0; j < ens2.size(); j++) {
				if (i == j) {
					element = ens1.get(i);
					if (list.size() != 0) {
						while ((list.get(position) != element) && (position < list.size())) {
							position++;
						}
						if (position < list.size()-1) flag = false;
					}
					if ((list.size() == 0) || (flag)) {
						list.add(element);
						nbElementCom++;
						sommeVal += element;
					}
				}
			}
		}
		System.out.println(nbElementCom + " elements sont communs à ces deux ensembles." 
				+ "\nLa somme de ces éléments donne " + sommeVal);
		System.out.println("Le resultat de l'intersection de ces deux ensembles est:");
		AfficherContenuEnsemble(list);
		
		return list;
	}
	
	/**
	 * Vérifie l'appartenance d'un element à un ensemble désigné
	 * @param list		Ensemble désigné
	 * @param element	Element à vérifier
	 * @return			oui ou non il appartient
	 */
	public static boolean AppartenanceElementEnsemble(ArrayList<Integer> list, int element) {
		if (list.contains(element)) return true;
		else return false;
	}
	
	/**
	 * Retourne la taille de l'ensemble désigné
	 * @param list		Ensemble désigné
	 * @return			Taille entière de l'ensemble désigné
	 */
	public static int ComptageElementsEnsemble(ArrayList<Integer> list) {
		return list.size();
	}
}
