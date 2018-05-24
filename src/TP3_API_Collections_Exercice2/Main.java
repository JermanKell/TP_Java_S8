package TP3_API_Collections_Exercice2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		System.out.println("//////////////////////////////////////////////////");
		System.out.println("/\tOutils pour le calcul mathématique\t/");
		System.out.println("//////////////////////////////////////////////////\n");		
		
		while (flag) {
			Actions();
			
			System.out.println("Veuillez saisir l'opération à effectuer:");
			int selec = sc.nextInt();
			
			switch (selec) {
				case 1: try {
					Controlleur.creerSingleton(sc);
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}					
					break;
				case 2: try {
					Controlleur.AjouterElement(sc);
				}	catch(Exception e) {
					System.out.println(e.getMessage());
				}					
					break;
				case 3: try {
					Controlleur.AfficherContenuEnsemble(sc);
				} catch (IndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
					break;
				case 4: try {
					Controlleur.CalculUnionEnsembles(sc);
				}	catch (IndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
					break;
				case 5: try {
					Controlleur.CalculIntersectionEnsembles(sc);
				}	catch(IndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
					break;
				case 6: try {
					Controlleur.AppartenanceElementEnsemble(sc);
				}	catch(Exception e) {
					System.out.println(e.getMessage());
				}
					break;
				case 7: try {
					Controlleur.ComptageElementsEnsemble(sc);
				}	catch(Exception e) {
					System.out.println(e.getMessage());
				}
					break;
				case 0: System.out.println("Fermeture de l'applicatino en cours...");
					flag = false;
					break;
				default:
					System.out.println("Le nombre saisi: " + selec + ", ne correspond à aucune action. Veuillez recommencer !");
					break;
			}
		}
	}
	
	public static void Actions() {
		System.out.println("\t- 1: Création d'un singleton");
		System.out.println("\t- 2: Ajout d'un élément à un ensemble");
		System.out.println("\t- 3: Affichage d'un ensemble");
		System.out.println("\t- 4: Calcul de l'union entre deux ensembles");
		System.out.println("\t- 5: Calcul de l'intersection entre deux ensembles");
		System.out.println("\t- 6: Appartenance d'un élément à un ensemble");
		System.out.println("\t- 7: Calcul de la taille d'un ensemble");
		System.out.println("\t- 0: Fermeture de l'application");		
	}
}
