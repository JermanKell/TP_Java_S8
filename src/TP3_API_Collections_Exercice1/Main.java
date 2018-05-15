package TP3_API_Collections_Exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean stopVal = true;
		
		ArrayList<Integer> lNotes = new ArrayList<Integer>();
		ArrayList<Integer> coefnotes = new ArrayList<Integer>();
		lNotes.add(12);
		coefnotes.add(1);
		lNotes.add(14);
		coefnotes.add(2);
		lNotes.add(9);
		coefnotes.add(3);
		
		while (stopVal) {
			System.out.println("Bienvenue dans l'application de saisie des notes. \nVeuillez choisir une opération");
			
			Actions();
			
			int selec = sc.nextInt();
			
			switch(selec) {
				case 1:	try {
					Controlleur.AjouterNote(sc, lNotes, coefnotes);
				} catch(Exception e) {
					e.getMessage();
				}
				break;
				case 2: try {
					Controlleur.VisualiserNotes(lNotes, coefnotes);
				} catch (Exception e) {
					e.getMessage();
				}
					break;
				case 3: try {
					Controlleur.ModifierNote(lNotes, sc);
				} catch (IllegalArgumentException e) {
					e.getMessage();
				}
					break;
				case 4: try {
					Controlleur.CalculMoyenne(lNotes, coefnotes);
				} catch (Exception e) {
					e.getMessage();
				}
					break;
				case 0:	System.out.println("Fermeture de l'application...");
					stopVal = false;
					break;
			}
		}
	}
	
	private static void Actions() {
		System.out.println("\t1: Ajout d'une note dans la base");
		System.out.println("\t2: Visualisation des notes déjà dans la base");
		System.out.println("\t3: Modification d'une note");
		System.out.println("\t4: Calcul de la moyenne de l'étudiant");
		System.out.println("\t0: Quitter l'application");
	}
	
}
