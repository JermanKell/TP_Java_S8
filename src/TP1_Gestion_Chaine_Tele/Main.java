package TP1_Gestion_Chaine_Tele;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Emission> programmation = new ArrayList<Emission>();
		
		Documentaire doc = new DocumentaireAnimalier("La Planète des Singes", 2);
		Documentaire doc2 = new DocumentaireCulturel("L'ordi", 5, "la technologie");
		
		Emission mario = new Jeux("Mario World");
		Films Labyrinthe = new Films("Le Labyrinthe", 2);
		Emission Arrow = new Serie("Arrow");
		
		programmation.add(doc);
		programmation.add(doc2);
		programmation.add(mario);
		programmation.add(Labyrinthe);
		programmation.add(Arrow);	
		
		for (Emission e : programmation) {
			System.out.println("Hier, j'ai regardé " + e.nom);
		}
	}

}
