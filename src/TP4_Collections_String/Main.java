package TP4_Collections_String;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		Controlleur ctrl = new Controlleur();
		
		System.out.println("=================================");
		System.out.println("Operations sur les liste chainees");
		System.out.println("=================================\n");
		
		while (flag) {
			Actions();
			
			System.out.println("Veuillez saisir l'operation a effectuer:");
			int choix = sc.nextInt();
			
			switch(choix) {
				case 0: ctrl.CreerListe();
					break;
				case 1:
					break;
				case 2: 
					break;
				case 3:
					break;
				case 4: 
					break;
				case 5:
					break;
				case 6: 
					break;
				case 7:
					break;
				case 8: 
					break;
				case 9:
					break;
				case 10: 
					break;
				case 11:
					break;
				case 12: 
					break;
				case 13:
					break;
				case 14: 
					break;
				case 15:
					break;
				case 16: 
					break;
				case 17:
					break;
				case 18: 
					break;
				case 19:
					break;
				case 20: 
					break;
				case 21:
					break;
				case 22: 
					break;
				case 23:
					break;
			}
		}
		

	}
	
	public static void Actions() {
		System.out.println("0 - Créer une liste");
        System.out.println("1 - Ajouter des éléments à la liste");
        System.out.println("2 - Afficher les éléments d’une liste");
        System.out.println("3 - Afficher les éléments de la liste à partir d’une position donnée");
        System.out.println("4 - Afficher les éléments de la liste dans le sens inverse ");
        System.out.println("5 - Rajouter un élément donné à une position spécifique de la liste");
        System.out.println("6 - Insérer deux éléments en tête et en queue de liste");
        System.out.println("7 - Ajouter des éléments données à des emplacements spécifiques");
        System.out.println("8 - Afficher tous les éléments avec leurs indices dans la liste");
        System.out.println("9 - Ajouter des éléments à la liste");
        System.out.println("10 - Vérifier si un élément appartient à la liste");
        System.out.println("11 - Supprimer un élément donné de la liste");
        System.out.println("12 - Supprimer le premier élément de la liste");
        System.out.println("13 - Permuter deux éléments de la liste");
        System.out.println("14 - Mélanger les éléments de la liste");
        System.out.println("15 - Dupliquer la liste dans une nouvelle liste");
        System.out.println("16 - Supprimer le premier élément de la liste");
        System.out.println("17 - Récupérer (sans supprimer) le premier élément");
        System.out.println("18 - Récupérer (sans supprimer) le dernier élément");
        System.out.println("19 - Remplacer un élément d’indice i.");
        System.out.println("20 - Convertir la liste en ArrayList");
        System.out.println("21 - Vérifier si une liste est vide");
        System.out.println("22 - Comparer la liste avec une liste donnée");
        System.out.println("23 - Quitter l'application\n");
	}

}
