package TP2_Factorielle;

public class Main {

	public static void main(String[] args) {
		Analyse rsh = new Analyse();
		int res; 
		
		try {
			rsh.Recherche();
			
			res = Calcul.getResultat();
			if (res != 1)	System.out.println("Le r�sultat final pour " + Calcul.getVariable() + " est "
					+ Calcul.getResultat());
			else System.out.println("Ca n'a pas march�");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
