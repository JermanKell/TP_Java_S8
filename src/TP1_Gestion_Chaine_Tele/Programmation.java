package TP1_Gestion_Chaine_Tele;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Programmation {
	private ArrayList<Emission> divertissement = null;
	private ArrayList<Emission> fiction = null;
	private ArrayList<Emission> reportage = null;
	private HashMap<Integer, Emission> programme = null;
	
	public Programmation() {
		divertissement = new ArrayList<Emission>();
		fiction = new ArrayList<Emission>();
		reportage = new ArrayList<Emission>();
		programme = new HashMap<Integer, Emission>();
	}
	
	private  void Triage(ArrayList<Emission> tri) {
		for (Emission e : tri) {
			if (e.getClass() == Jeux.class) divertissement.add(e);
			else if (e.getClass() == Mangas.class) {
				if (e.IsARedif()) divertissement.add(e);
				else fiction.add(e);
			}
			else if (e.getClass() == Serie.class) {
				if (e.IsARedif())	divertissement.add(e);
				else fiction.add(e);
			}
			else if (e.getClass() == Films.class)	fiction.add(e);
			else if ((e.getClass() == DocumentaireAnimalier.class) || (e.getClass() == DocumentaireCulturel.class))
				reportage.add(e);
		}
	}
	
	public void ProgrammerChaine(ArrayList<Emission> tri) {
		Triage(tri);
		
	}
	
	
}
