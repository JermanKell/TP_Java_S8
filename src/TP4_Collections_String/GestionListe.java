package TP4_Collections_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class GestionListe {
	
	public GestionListe() {
		
	}
	
	public LinkedList<String> CreerNvlListe() {
		LinkedList<String> liste = new LinkedList<String>();
		
		return liste;
	}
	
	public void AjouterElement(LinkedList<String> liste, String element) {
		liste.add(element);
		System.out.println("L'element " + element + " a bien ete ajoute");
	}
	
	public void AjouterElement(LinkedList<String> liste, String[] element) {
		for (String str : element) {
			liste.add(str);
		}
		System.out.println("Tous les elements présents dans le tableau ont ete ajoutes");
	}
	
	public void AfficherElements(LinkedList<String> liste) {
		System.out.println("Voici les elements presents dans la liste:");
		for (String str : liste) {
			System.out.println("\t- " + str);
		}
	}
	
	public void AfficherElements(LinkedList<String> liste, int position) {
		if ((position < liste.size()) && (position > 0)) {
			int i;
			
			System.out.println("Voici les elements presents dans la liste à partir de la position " + position);
			
			for (i = (position-1); i < liste.size(); i++) {
				System.out.println("\t- " + liste.get(i));
			}
		}
		else System.out.println("La taille renseignee est incorrecte");		
	}
	
	public void AjouterElement(LinkedList<String> liste, String element, int position) {
		if ((position < liste.size()) && (position > 0)) {
			liste.add(position-1, element);
			System.out.println("L'element " + element + " a bien ete ajoute a la position " + position);
		}
		else System.out.println("La taille renseignee n'est pas correcte ");
	}
	
	public void AjouterElements(LinkedList<String> liste, String e1, String e2) {
		liste.addFirst(e1);
		liste.addLast(e2);
	}
	
	public void AjouterElements(LinkedList<String> liste, String[] tabElements, int[] tabPos) {
		int i;
		
		if (tabElements.length != tabPos.length) System.out.println("Les tailles des deux tableaux sont différentes");
		else {
			for (i = 0; i < tabPos.length; i++) {
				if ((tabPos[i] > 0) && (tabPos[i] <= liste.size())){
					liste.add(tabPos[i], tabElements[i]);
					System.out.println("L'element " + tabElements[i] + " a bien ete ajoute a la position " + tabPos[i]);
				}
				else System.out.println("L'element " + tabElements[i] + " a bien ete ajoute a la position " + tabPos[i] 
						+ " car sa position n'est pas correcte");
			}
		}
	}
	
	public void AfficherElementsPos(LinkedList<String> liste) {
		int i;
		
		System.out.println("Element: \tPosition:");
		
		for (i = 0; i < liste.size(); i++) {
			System.out.println("- " + liste.get(i) + "\t" + i+1);
		}
	}
	
	public void TrouverElement(LinkedList<String> liste, String element) {
		boolean flag = true;
		int position = 0;
		String e;
		
		while (flag && (position < liste.size())) {
			e = liste.get(position);
			if (e.equals(element)) {
				System.out.println("L'element " + element + " a ete trouve dans la liste a la position " + position+1);
				flag = false;
			}
			else position++;
		}
		if (flag)	System.out.println("L'element " + element + " n'est pas present dans cette liste");
	}
	
	public void SupprimerElement(LinkedList<String> liste, String element) {
		boolean flag = true; 
		int position = 0;
		String e;
		
		while (flag && (position < liste.size())) {
			e = liste.get(position);
			if (e.equals(element)) {
				liste.remove(e);
				flag = false;
			}
			else position++;
		}
		if (flag) System.out.println("L'element " + element + " n'a pu etre supprime car non present dans la liste");
	}
	
	public void SupprimerElement(LinkedList<String> liste, int position) {
		if (position < liste.size())	liste.remove(position);
		else System.out.println("Impossible de supprimer l'element a la position " + position + " car non correcte (0-" + liste.size() + ")");
	}
	
	public void PermuterElements(LinkedList<String> liste) {
		int position = 0, compteur = 0, posR = liste.size()+1, posN = liste.size()+1;
		String e;
		String error = "Permutation impossible: la position de ";
		
		while ((compteur < 2) && (position < liste.size())) {
			e = liste.get(position);
			if (e.equals("Rouge")) {
				posR = position;
				liste.remove(position);
			}
			else if (e.equals("Noir")) {
				posN = position;
				liste.remove(position);
			}
			else position++;
		}
		if ((posN == liste.size()+1) || (posR == liste.size()+1)) {
			if (posN == liste.size()+1)	System.out.println(error + " Noire est incorrecte");
			if (posR == liste.size()+1)	System.out.println(error + " Rouge est incorrecte");
		}
		else {
			liste.add(posN, "Rouge");
			liste.add(posR, "Noir");
		}
	}
	
	public void MelangerElements(LinkedList<String> liste) {
		Collections.shuffle(liste);
	}
	
	public LinkedList<String> DupliquerListe(LinkedList<String> liste) {
		@SuppressWarnings("unchecked")
		LinkedList<String> list = (LinkedList<String>) liste.clone();
		return list;
	}
	
	public String RecupererPremierElement(LinkedList<String> liste) {
		return liste.peekFirst();
	}
	
	public String RecupererDernierElement(LinkedList<String> liste) {
		return liste.peekLast();
	}
	
	public void RemplacerElement(LinkedList<String> liste, String element, int position) {
		if (position < liste.size()) {
			liste.add(position, element);
			liste.remove(position+1);
		}
		else System.out.println("La position est incorrecte car elle doit etre comprise entre 1 et " + liste.size());
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<String> ConvertirListe(LinkedList<String> liste) {
		return (ArrayList<String>) liste.clone();
	}
	
	public void ListeVide(LinkedList<String> liste) {
		boolean vide = liste.isEmpty();
		if (vide)	System.out.println("La liste passee en parametre est vide");
		else	System.out.println("La liste passee en parametre n'est pas vide");
	}
	
	public void ComparerListes(LinkedList<String> liste1, LinkedList<String> liste2) {
		if (liste1.hashCode() == liste2.hashCode())	System.out.println("Le contenu des deux listes est le meme");
		else System.out.println("Le contenu des deux listes est différent");
	}
}
