package TP1_Gestion_employés;

import java.util.ArrayList;
import java.util.List;

public class Paie {
	private static ArrayList<Employe> lEmp = null;

	public static void main(String[] args) {
		lEmp = new ArrayList<Employe>();

		for (Employe e : lEmp) {
			System.out.println(e.getNom() + "gagne " + e.SalaireAccesseur() + "€");
		}
		
	}

}
