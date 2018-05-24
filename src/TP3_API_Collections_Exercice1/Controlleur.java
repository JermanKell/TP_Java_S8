package TP3_API_Collections_Exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlleur {
	public static void AjouterNote(Scanner sc, ArrayList<Integer> lNotes, ArrayList<Integer> coef) {
		int nvNote = 0, coeff = 0;
		
		if (lNotes.size() != coef.size())	throw new IndexOutOfBoundsException("La taille des tableaux sont diff�rentes.");
		
		System.out.println("Veuillez saisir la note � ajouter");	
		sc.nextLine();
		
		nvNote = sc.nextInt();
		if (nvNote < 0)	throw new IllegalArgumentException("La note tapee n'est pas correct (" + nvNote + " < 0)");
		else if (nvNote > 20) throw new IllegalArgumentException("La note tapee n'est pas correct (" + nvNote + " > 20)");
		sc.nextLine();
		
		System.out.println("Veuillez saisir le coefficient associ� a cette note:");
		coeff = sc.nextInt();
		if (coeff < 0)	throw new IllegalArgumentException("La note tapee n'est pas correct (" + nvNote + " < 0)");
		else if (coeff > 10) throw new IllegalArgumentException("La note tapee n'est pas correct (" + nvNote + " > 10)");
		
		Etudiant.AjouterNote(lNotes, coef, nvNote, coeff);
	}
	
	public static void VisualiserNotes(ArrayList<Integer> notes, ArrayList<Integer> lCoeff) {
		if ((notes.size() == 0) || (lCoeff.size() == 0))	throw new IndexOutOfBoundsException("Aucune note ne peut �tre affich�e, la taille du tableau est nulle");
		else if (notes.size() != lCoeff.size()) throw new ArrayIndexOutOfBoundsException("Les tailles des tableaux sont diff�rentes");
		
		Etudiant.AffichageNotes(notes, lCoeff);
	}

	public static void ModifierNote(ArrayList<Integer> notes, Scanner sc) throws IllegalArgumentException{
		int note = 0, nvNote = 0;
		
		System.out.println("Veuillez taper la note � remplacer:");
		note = sc.nextInt();
		sc.nextLine();
		if (note < 0)	throw new IllegalArgumentException("La note tapee n'est pas correct (" + note + " < 0)");
		else if (note > 20)	throw new IllegalArgumentException("La note tapee n'est pas correct (" + note + " > 20)");
		
		System.out.println("Veuillez saisir la nouvelle note:");
		nvNote = sc.nextInt();
		if (nvNote < 0)	throw new IllegalArgumentException("La note tapee n'est pas correct (" + nvNote + " < 0)");
		else if (nvNote > 20)	throw new IllegalArgumentException("La note tapee n'est pas correct (" + nvNote + " > 20)");
		
		System.out.println("La note " + note + " doit donc �tre chang�e par un " + nvNote);
		Etudiant.ChangerNote(notes, note, nvNote);
	}
	
	public static void CalculMoyenne(ArrayList<Integer> lNotes, ArrayList<Integer> lCoef) {
		double moy;
		if ((lNotes.size() == 0) || (lCoef.size() == 0))	throw new IllegalArgumentException("La taille du tableau est incorrecte");
		else if (lNotes.size() != lCoef.size())	throw new IndexOutOfBoundsException("Les tailles des tableaux sont diff�rentes");
		
		moy = Etudiant.CalculMoyenne(lNotes, lCoef);

		System.out.println("La moyenne de l'etudiant " + Etudiant.prenom + " " + Etudiant.nom + " est " + moy + "/20");
	}
}
