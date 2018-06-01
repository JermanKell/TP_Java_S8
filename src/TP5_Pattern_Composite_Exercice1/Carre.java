package TP5_Pattern_Composite_Exercice1;

import java.util.ArrayList;

public class Carre implements Figure{
	private ArrayList<Figure> cotes = null;

	public Carre() {
		cotes = new ArrayList<Figure>();
	}
	@Override
	public void Dessiner() {
		for (Figure f : cotes) {
			Ligne l = (Ligne) f;
			l.Dessiner();
		}		
	}

	@Override
	public void Translater() {
		for (Figure f : cotes) {
			Ligne l = (Ligne) f;
			l.Translater();
		}		
	}
	@Override
	public int getNbPoints() {
		int nbpoints = 0;
		
		for (Figure f : cotes) {
			Ligne l = (Ligne) f;
			nbpoints += l.getNbPoints();
		}
		
		return nbpoints;
	}
	@Override
	public void Modifier() {
		for (Figure f : cotes) {
			Ligne l = (Ligne) f;
			l.Modifier();
		}
	}

}
