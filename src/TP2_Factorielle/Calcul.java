package TP2_Factorielle;

public class Calcul {
	private static int resFac = 1;
	private static int varFac;
	
	private Calcul() {
		
	}
	
	/**
	 * Méthode de calcul du factorielle
	 * @param val
	 */
	public static void calcul(int val) {
		varFac = val;
		for (int i = 2; i < val+1; i++) {
			resFac *= i;
			System.out.println("Au tour " + i + ", on a la valeur " + resFac);
		}
	}
	
	public static int getResultat() {
		return resFac;
	}
	
	public static int getVariable() {
		return varFac;
	}
}
