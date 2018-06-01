package TP5_Pattern_Composite_Exercice1;

import java.util.Scanner;

public final class Point implements Figure{
	private int coorX;
	private int coorY;
	private Scanner sc = null;
	
	public Point() {
		sc = new Scanner(System.in);
	}
	
	public Point(int x, int y) {
		coorX = x;
		coorY = y;
		sc = new Scanner(System.in);
	}

	@Override
	public void Modifier() {
		int posX, posY;
		
		System.out.println("Veuillez rentrer la coordonnée en X:");
		posX = sc.nextInt();
		if (!(posX%2 == 0) || !(posX%2 == 1))	throw new IllegalArgumentException("La valeur en X est incorrecte: non entière");
		
		System.out.println("Veuillez rentrer la coordonnée en Y:");
		posY = sc.nextInt();
		if (!(posX%2 == 0) || !(posX%2 == 1))	throw new IllegalArgumentException("La valeur en X est incorrecte: non entière");
		
		coorX = posX;	coorY = posY;				
	}

	@Override
	public void Dessiner() {
		System.out.println("Je suis dessiné au point coupant " + coorX + " en X et " + coorY + " en Y");
	}

	@Override
	public void Translater() {
		int posX, posY, choix;
		
		System.out.println("Sur quel axe faire une translation:");
		System.out.println("\t1: Axe X");
		System.out.println("\t2: Axe Y");
		
		choix = sc.nextInt();
		if ((choix < 1) && (choix > 2))	throw new IllegalArgumentException("Saisie incorrecte");
		else if (choix == 1) {
			System.out.println("Veuillez saisir la nouvelle valeur de la coordonnée:");
			posX = sc.nextInt();
			if (!(posX%2 == 0) || !(posX%2 == 1))	throw new IllegalArgumentException("La valeur en X est incorrecte: non entière");
			else posX = coorX;
		}
		else if (choix == 2) {
			System.out.println("Veuillez saisir la nouvelle valeur de la coordonnée:");
			posY = sc.nextInt();
			if (!(posY%2 == 0) || !(posY%2 == 1))	throw new IllegalArgumentException("La valeur en X est incorrecte: non entière");
			else posY = coorY;
		}
	}

	@Override
	public int getNbPoints() {
		// TODO Auto-generated method stub
		return 0;
	}
}
