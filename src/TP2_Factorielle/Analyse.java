package TP2_Factorielle;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Analyse {
	private Scanner sc = null;
	private int valeurFac = 0;
	
	
	public Analyse() {
		sc = new Scanner(System.in);
	}
	
	public void Recherche() throws Exception{
		System.out.println("Veuillez rentrer l'entier dont le factorielle doit etre calcule:\n");
		String str = sc.nextLine();
		if(str.equals("")) throw new ArrayIndexOutOfBoundsException("Indiquez le nombre d'entiers sur la ligne de commande");
		
		valeurFac = Integer.parseInt(str);
		
		if (valeurFac%2 > 1) throw new NumberFormatException("L'argument doit �tre un entier");
		
		if (valeurFac == -4) throw new Exception("-4 est n�gatif: le factorielle n'est pas d�finie");
		else if(valeurFac < 0) throw new InvalidParameterException("La valeur pass�e en param�tre est n�gative");
		else if (valeurFac == 20) throw new Exception("ExceptionGrand: 20 est trop grand pour ce programme");
	
		Calcul.calcul(valeurFac);
	}

}
