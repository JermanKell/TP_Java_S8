package TP3_API_Collections_Exercice2;

import java.util.ArrayList;

public class GestionListe {
	public static ArrayList<Integer> creerSingleton(int element) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(element);
		return list;		
	}
	
	public static void AjouterElement(ArrayList<Integer> list, int element) {
		list.add(element);
	}
	
	public static void AfficherContenuEnsemble(ArrayList<Integer> list) {
		System.out.println("Le(s) valeur(s) contenue(s) dans l'ensemble:");
		for (int valeur : list) {
			System.out.println("\t- " + valeur);
		}
	}
	
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
}
