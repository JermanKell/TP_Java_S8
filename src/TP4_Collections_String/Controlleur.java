package TP4_Collections_String;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Controlleur {
	private GestionListe gst = null;
	private ArrayList<LinkedList<String>> tab = null;
	
	public Controlleur() {
		gst = new GestionListe();
		tab = new ArrayList<LinkedList<String>>();
	}
	
	/**
	 * Créé une liste chainée stockée après création
	 * @author Xavier Bouchenard
	 */
	public void CreerListe() {
		LinkedList<String> list = gst.CreerNvlListe();
		if (list != null)	System.out.println("Liste créée");
		else	System.out.println("Erreur lors de la création de la liste");
		tab.add(list);
	}
	
	/**
	 * Affiche le contenu d'une liste choisi par l'utilisateur si elle existe
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void AfficherListe(Scanner sc) {
		int position = 0;
		
		System.out.println("Veuillez saisir la position de la liste a remplir");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			gst.AfficherElements(list);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Affiche le contenu d'une liste a partir d'une position
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void AfficherListeFromPos(Scanner sc) {
		int positionTab = 0, position = 0;
		
		System.out.println("Veuillez saisir le tableau à modifier:");
		position = sc.nextInt();
		System.out.println("Veuillez saisir la position à partir de laquelle l'affichage doit commencer:");
		positionTab = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			
			if ((positionTab > 0) && (positionTab <= list.size()))
				gst.AfficherElements(list, positionTab);
			else throw new ArrayIndexOutOfBoundsException("Impossible d'effectuer l'affichage à partir de la position " + positionTab 
					+ " car la taille max est de " + list.size());
		}
		else throw new ArrayIndexOutOfBoundsException("Impossible de recuperer cette liste chainee");
	}
	
	/**
	 * Affiche la liste avec tous les elements et les positions associées
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void AfficherListePos(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		
		System.out.println("Veuillez saisir la position de la liste à afficher:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size()))
			gst.AfficherElementsPos(list);
	}
	
	public void AfficherListeInverse(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		
		System.out.println("Veuillez saisir la position de la liste à afficher:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			gst. AfficherElementsInverse(list);
		}
	}
	
	/**
	 * Ajoute un element simple a une liste
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void AjouterSimpleElement(Scanner sc) {
		String element = null;
		int position = 0;
		
		System.out.println("Veuillez saisir l'element a ajouter:");
		element = sc.nextLine();
		System.out.println("Veuillez saisir la position de la liste a remplir");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			gst.AjouterElement(list, element);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Ajoute un tableau de string dans la liste chainee
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void AjouterElements(Scanner sc) {
		int nbElements = 0, i = 0, position = -1;
		String element = null;
		
		System.out.println("Veuillez saisir le nb d'elements a ajouter:");
		nbElements = sc.nextInt();
		
		System.out.println("Veuillez saisir la position de la liste a remplir");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			ArrayList<String> lStr = new ArrayList<String>();

		
			while (i < nbElements) {
				System.out.println("Element a ajouter:");
				element = sc.nextLine();
				lStr.add(element);
			}
			
			gst.AjouterElement(list, (String[])lStr.clone());
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");				
	}
	
	/**
	 * Ajoute un element à une position precise
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void AjouterElementFromPos(Scanner sc) {
		int positionTab = 0, position = 0;
		String element = null;
		
		System.out.println("Element a ajouter:");
		element = sc.nextLine();
		System.out.println("Veuillez saisir la position de la liste a remplir");
		position = sc.nextInt();
		System.out.println("Veuillez saisir la position d'insertion de l'element :");
		positionTab = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			
			if ((positionTab > 0) && (positionTab <= list.size()))
				gst.AjouterElement(list, element, positionTab);
			else throw new ArrayIndexOutOfBoundsException("Impossible d'ajouter un element ici ");
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");		
	}
	
	/**
	 * Ajoute les elements selectionnés à une position donnée
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void AjouterElementsFromPos(Scanner sc) {
		int position = 0, tailleTab = 0, i =0, posTab = 0;
		String element = null;
		ArrayList<String> lString = new ArrayList<String>();
		ArrayList<Integer> lInteger = new ArrayList<Integer>();
		
		System.out.println("Veuillez saisir le nb d'elements(s) à ajouter:");
		tailleTab = sc.nextInt();
		System.out.println("Veuillez saisir la position du tableau à récupérer:");
		posTab = sc.nextInt();
		
		if ((posTab > 0) && (posTab <= tab.size())) {
			LinkedList<String> list = tab.get(posTab-1);
			
			while (i < tailleTab) {
				System.out.println("Element a ajouter:");
				element = sc.nextLine();
				System.out.println("... à la position:");
				position = sc.nextInt();
				
				if ((position > 0) && (position <= tailleTab)) {
					lString.add(element);
					lInteger.add(position);
				}
				i++;
			}
			gst.AjouterElements(list, (String[])lString.clone(), (int[])lInteger.clone());
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Ajoute deux elements quelconques en debut et fin de liste
	 * @author Xavier Bouchenard
	 * @param sc
	 */
	public void AjouterElementsDebFin(Scanner sc) {
		int position = 0;
		String e1 = null, e2 = null;
		
		System.out.println("Veuillez saisir la position du tableau à modifier:");
		position = sc.nextInt();
		System.out.println("Veuillez saisir le premier element a ajouter:");
		e1 = sc.nextLine();
		System.out.println("Veuillez saisir le second element à ajouter:");
		e2 = sc.nextLine();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			
			gst.AjouterElements(list, e1, e2);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Determine si un element fait partie de la liste
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void TrouverElement(Scanner sc) {
		int position = 0;
		String element = null;
		
		System.out.println("Veuillez saisir la position du tableau où effectuer la recherche:");
		position = sc.nextInt();
		System.out.println("Veuillez saisir l'element a trouver:");
		element = sc.nextLine();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			
			gst.TrouverElement(list, element);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Supprime un element si present dans la liste
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void SupprimerElement(Scanner sc) {
		int position = 0;
		String element = null;
		
		System.out.println("Veuillez saisir la position du tableau où l'element doit être supprimé:");
		position = sc.nextInt();
		System.out.println("Veuillez saisir l'element a supprimer:");
		element = sc.nextLine();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			
			gst.SupprimerElement(list, element);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Supprime un element depuis une position
	 * @param sc	Scanner
	 */
	public void SupprimerElementFromPos(Scanner sc) {
		int position = 0, posTab = 0;
		
		System.out.println("Veuillez saisir la position du tableau où l'element doit être supprimé:");
		position = sc.nextInt();
		System.out.println("Veuillez saisir la position de l'element a supprimer:");
		posTab = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
			
			if ((posTab > 0) && (posTab <= list.size()))
				gst.SupprimerElement(list, posTab);
			else throw new ArrayIndexOutOfBoundsException("Impossible de supprimer un element à partir de cette position");
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Permute les elements d'une liste
	 * @author Xavier Bouchenard
	 * @param sc
	 */
	public void PermuterElements(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		
		System.out.println("Veuillez saisir la position du tableau où l'element doit être supprimé:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			list = tab.get(position-1);
			
			gst.PermuterElements(list);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Melange le contenu des elements de la liste
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void MelangerListe(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		
		System.out.println("Veuillez saisir la position de la liste a selectionner:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			list = tab.get(position-1);
			
			gst.MelangerElements(list);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");			
	}
	
	/**
	 * Duplique la liste selectionnee et stocke le resultat de la copie
	 * @param sc	Scanner
	 */
	public void DupliquerListe(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		LinkedList<String> rcvList = null;
		
		System.out.println("Veuillez saisir la position de la liste a selectionner:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			list = tab.get(position-1);
			
			rcvList = gst.DupliquerListe(list);
			tab.add(rcvList);
			
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Recupere et affiche le premier element de la liste
	 * @author Xavier Bouchneard
	 * @param sc	Scanner
	 */
	public void RecupererPremierElement(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		String element = null;
		
		System.out.println("Veuillez saisir la position de la liste a selectionner:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			list = tab.get(position-1);
			
			element = gst.RecupererPremierElement(list);		
			System.out.println("Le premier element de la liste est " + element);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Recupere le dernier element de la liste et l'affiche
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void RecupererDernierElement(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		String element = null;
		
		System.out.println("Veuillez saisir la position de la liste a selectionner:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			list = tab.get(position-1);
			
			element = gst.RecupererPremierElement(list);		
			System.out.println("Le dernier element de la liste est " + element);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Remplace l'ancien element à une position par un nouvel
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void RemplacerElement(Scanner sc) {
		int position = 0, posTab = 0;
		LinkedList<String> list = null;
		String element = null;
		
		System.out.println("Veuillez saisir la position de la liste a selectionner:");
		position = sc.nextInt();
		
		System.out.println("Veuillez saisir la position où modifier l'element:");
		posTab = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			list = tab.get(position-1);
			
			if ((posTab > 0) && (posTab <= list.size())) 
				gst.RemplacerElement(list, element, posTab);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Convertit une liste chainee en arraylist
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void ConvertirListe(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		ArrayList<String> ltemp = null;
		
		System.out.println("Veuillez saisir la position de la liste a selectionner:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			list = tab.get(position-1);
			
			ltemp = gst.ConvertirListe(list);
			
			System.out.println("Voici le contenu de mon arraylist:");
			for (String str : ltemp)	System.out.println(str);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Vérifie si une liste stockée est vide
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void ListeVide(Scanner sc) {
		int position = 0;
		LinkedList<String> list = null;
		
		System.out.println("Veuillez saisir la position de la liste a selectionner:");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			list = tab.get(position-1);
			
			gst.ListeVide(list);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
	
	/**
	 * Compare les listes pour trouver des similitudes
	 * @author Xavier Bouchenard
	 * @param sc	Scanner
	 */
	public void ComparerListes(Scanner sc) {
		int pos1 = 0, pos2 = 0;
		LinkedList<String> list = null;
		LinkedList<String> ltemp = null;
		
		System.out.println("Veuillez saisir la position de la première liste a selectionner:");
		pos1 = sc.nextInt();
		
		System.out.println("Veuillez saisir la position de la seconde liste a selectionner:");
		pos1 = sc.nextInt();
		
		if ((pos1 > 0) && (pos1 <= tab.size()) && (pos2 > 0) && (pos2 <= tab.size())) {
			list = tab.get(pos1-1);
			
			gst.ComparerListes(list, ltemp);
		}
		else throw new ArrayIndexOutOfBoundsException("La position renseignee est incorrecte");	
	}
}
