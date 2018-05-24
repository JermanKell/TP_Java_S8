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
	
	public void CreerListe() {
		LinkedList<String> list = gst.CreerNvlListe();
		if (list != null)	System.out.println("Liste créée");
		else	System.out.println("Erreur lors de la création de la liste");
		tab.add(list);
	}
	
	public void AjouterElements(Scanner sc) throws NoSuchElementException, InputMismatchException{
		int nbElements = 0, i = 0, position = 100;
		String element = null;
		
		System.out.println("Veuillez saisir le nb d'elements a ajouter:");
		nbElements = sc.nextInt();
		
		System.out.println("Veuillez saisir la position de la liste a remplir");
		position = sc.nextInt();
		
		if ((position > 0) && (position <= tab.size())) {
			LinkedList<String> list = tab.get(position-1);
		
			while (i < nbElements) {
				System.out.println("Element a ajouter:");
				element = sc.nextLine();
				list.add(element);
			}
		}
		else throw new IndexOutOfBoundsException("La position renseignee est incorrecte");
		
		
	}
}
