package TP2_Menu;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {		
		@SuppressWarnings("unused")
		int valeur = 0;		

		String[] tableau = {"A que coucou bob", "Je suis content", "t'es pas beau", "Salut Patrick"};
		
		try {
			valeur = Test.saisirChoix(10);
		} catch(Exception e) {
			System.out.println("Exception levée: " + e.getMessage());
			//e.printStackTrace();
		}
		
		try {
			Test.ChoixMenus(tableau);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception levée: " + e.getMessage());
		}
		
		try {
			Test.menuSelected(tableau);
		} catch(Exception e) {
			System.out.println("Exception levée: " + e.getMessage());
		}
	}

}
