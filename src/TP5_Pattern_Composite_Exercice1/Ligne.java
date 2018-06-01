package TP5_Pattern_Composite_Exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ligne implements Figure{
	private ArrayList<Figure> lPoints = null;
	private int nbPoints = 0;
	Scanner sc = null;
	
	public Ligne() {
		lPoints = new ArrayList<Figure>();
		sc = new Scanner(System.in);
	}
	
	public Ligne(int nbP) {
		lPoints = new ArrayList<Figure>();
		sc = new Scanner(System.in);
		
		int i;
		for (i = 0; i < nbP; i++) {
			lPoints.add(new Point());
			nbPoints++;
		}
	}
	
	@Override
	public int getNbPoints() {
		return nbPoints;
	}
	
	public void setNbPoints(int nbP) {
		double valeur = nbPoints - nbP;
		int i;
		
		if (valeur < 0) {
			// Passer la différence en positif
			valeur += (2*valeur);
			for (i = 0; i < valeur; i++) {
				lPoints.remove(lPoints.size());
				nbPoints -= 1;
			}
		}
		else if (valeur > 0) {
			for (i = 0; i < valeur; i++) {
				lPoints.add(new Point());
			}
		}
	}

	@Override
	public void Dessiner() {
		if (lPoints.size() > 0) {
			for (Figure f : lPoints) {
				Point point = (Point) f;
				point.Dessiner();
			}
		}
		else throw new ArrayIndexOutOfBoundsException("La taille du tableau est incorrecte");		
	}

	@Override
	public void Translater() {
		if (lPoints.size() > 0) {
			for (Figure f : lPoints) {
				Point point = (Point) f;
				point.Translater();
			}
		}
		else throw new ArrayIndexOutOfBoundsException("La taille du tableau est incorrecte");			
	}

	@Override
	public void Modifier() {
		int position;
		System.out.println("Quel point souhaitez-vous modifier");
		position = sc.nextInt();
		
		if (position < 0)	throw new ArrayIndexOutOfBoundsException("La position n'est pas correcte car nulle");
		if (position > lPoints.size())	throw new ArrayIndexOutOfBoundsException("La position ne correspond pas à un "
				+ "emplacement du tableau");
		if (!(position%2 == 0) || !(position%2 == 1))	throw new IllegalArgumentException("La valeur de position incorrecte: non entière");
		
		Point point = (Point) lPoints.get(position);
		point.Modifier();		
	}
}
