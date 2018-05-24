package TP3_API_Collections_Exercice1;

import java.util.ArrayList;

public class Etudiant {
	public static String nom = "Bob";
	public static String prenom = "Marley";
	
	public static void AjouterNote(ArrayList<Integer> lNotes, ArrayList<Integer> lCoef, int note, int coef) {
		lNotes.add(note);
		lCoef.add(coef);
	}
	
	public static void AffichageNotes(ArrayList<Integer> lNotes, ArrayList<Integer> lCoeff) {
		System.out.println("Voici toutes les notes de l'etudiant " + prenom + " " + nom + ":");
		for (int i = 0; i < lNotes.size(); i++) {
			System.out.println("\t-" + lNotes.get(i) + "\tcoef: " + lCoeff.get(i));
		}
	}
	
	public static double CalculMoyenne(ArrayList<Integer> lNotes, ArrayList<Integer> lCoef) {
		int nbNotes = lNotes.size(), SCoef = 0;
		double SNotes = 0;
		
		for (int i = 0; i < nbNotes; i++) {
			SCoef += lCoef.get(i);
			SNotes += (lNotes.get(i) * lCoef.get(i));
		}
		SNotes = SNotes / SCoef;
		
		return SNotes;
	}
	
	public static void ChangerNote(ArrayList<Integer> lNotes, int note, int noteChange) {
		if (lNotes.contains(note))	{
			int position = lNotes.lastIndexOf(note);
			lNotes.remove(position);
			lNotes.add(noteChange);
			System.out.println("La note " + note + " à la position " + position + 
					" dans le tableau a été changé par la note " + noteChange);
		}
		else throw new IllegalArgumentException("Impossible de modifier la note " + note + " car elle n'existe pas");
	}
}
