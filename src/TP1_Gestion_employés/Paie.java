package TP1_Gestion_employés;

import java.util.ArrayList;
import java.util.List;

public class Paie {
	private static ArrayList<Employe> lEmp = null;

	public static void main(String[] args) {
		lEmp = new ArrayList<Employe>();
		
		Employe Pierre = new Commercial("Pierre", "0247000001", 46, 35, 8510.33, 2.52, 15.25);
		Commercial Paul = new Commercial("Paul", "0665544332", 32, 27.25, 10000, 10.15, 15.25);
		
		Employe Robert = new Ouvrier("Robert", "0697421035", 55, 40.25, 0, 2.13, 9.8);
		Employe Jacky = new Ouvrier("Jacky", "3630", 33, 33.86, 15000.41, 7.85, 9.8);
		Ouvrier Michelle = new Ouvrier("Michelle", "0841256398", 27, 38.91, 22000.62, 3.15, 10.25);
		
		Employe Martine = new Collaborateur("Martine", "118218", 39, 36.85, 27000.14, 4.71, 17.50);
		
		lEmp.add(Pierre);
		lEmp.add(Paul);
		lEmp.add(Robert);
		lEmp.add(Jacky);
		lEmp.add(Michelle);
		lEmp.add(Martine);

		for (Employe e : lEmp) {
			System.out.println(e.getNom() + " gagne " + e.SalaireAccesseur() + "€");
		}
		
	}

}
