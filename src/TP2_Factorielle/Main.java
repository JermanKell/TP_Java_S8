package TP2_Factorielle;

public class Main {

	public static void main(String[] args) {
		Analyse rsh = new Analyse();
		
		try {
			rsh.Recherche();
		} catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		int res = Calcul.getResultat();
		if (res != 1)	System.out.println("Le résultat final pour " + Calcul.getVariable() + " est "
				+ Calcul.getResultat());
		else System.out.println("Ca n'a pas marché");

	}

}
