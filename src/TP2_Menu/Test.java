package TP2_Menu;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Test {
	
	private Test() {
		
	}
	
	/**
	 * Laisse l'utilisateur sélectionner un nombre 
	 * @param n				Borne maximal à ne pas franchir
	 * @return				Retourne le nb saisi si 1 <= var <= n
	 * @throws Exception	Levée si le nb dépasse les bornes ou dans d'autres cas
	 */
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
	
	/**
	 * Liste les différents menus possibles
	 * @param tabStr	Tableau de strings
	 */
	public static void ChoixMenus(String[] tabStr) {
		if ((tabStr == null) || (tabStr.length == 0))	throw new ArrayIndexOutOfBoundsException("le tableau n'est pas initialisée");
		for (String str : tabStr) {
			System.out.println("Menu: " + str);
		}
		System.out.println("\n");
	}
	
	/**
	 * Permet à l'utilisateur de sélectionner un menu et d'afficher sa sélection
	 * @param tab			Tableau de menus
	 * @throws Exception	Exception levée s'il y a une erreur
	 */
	public static void menuSelected(String[] tab) throws Exception {
		System.out.println("Voic tous les menus possibles:");
		ChoixMenus(tab);
		
		// En passant la taille du tableau en parametre a cett méthode, on gère déjà la borne supérieure
		int valeur = saisirChoix(tab.length);
		System.out.println("Menu choisi: " + tab[valeur-1]);
	}
}
