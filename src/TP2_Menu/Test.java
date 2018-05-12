package TP2_Menu;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Test {
	
	private Test() {
		
	}
	
	public static int saisirChoix(int n) throws Exception{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		if (n < 2)	throw new InvalidParameterException("Le paramètre passé est trop petit: " + n + " < 2");
		
		System.out.println("Veuillez rentrer le nombre voulu:");
		String str = sc.nextLine();
		
		if (str.equals(""))	throw new ArrayIndexOutOfBoundsException("Aucune valeur n'a été renseignée");
		
		int var = Integer.parseInt(str);
		if (var%2 > 1) throw new NumberFormatException("L'argument doit être un entier");
				
		if ((var < 1) || (var > n))	throw new Exception("Le nombre " + var + " n'est pas compris entre 1 et "
				+ n);
		
		return var;
	}
	
	public static void ChoixMenus(String[] tabStr) {
		if (tabStr == null)	throw new ArrayIndexOutOfBoundsException("le tableau n'est pas initialisée");
		for (String str : tabStr) {
			System.out.println("Menu: " + str);
		}
	}
	
	public static void menuSelected(String[] tab) throws Exception {
		System.out.println("Voic tous les menus possibles:");
		ChoixMenus(tab);
		
		int valeur = saisirChoix(tab.length);
		System.out.println("Menu choisi: " + tab[valeur-1]);
	}
}
