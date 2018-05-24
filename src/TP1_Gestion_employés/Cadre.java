package TP1_Gestion_employés;

public class Cadre extends Employe{

	public Cadre(String nom, String numero, int age, double nbHeuresT, double CAffaires, double HSup, double prixH,
			SalaireTauxHeures paieH, SalairePourcentage paieP) {
		super(nom, numero, age, nbHeuresT, CAffaires, HSup, prixH, paieH, paieP);
	}

	public Cadre(String nom, String numero, int age, SalaireTauxHeures paieH, SalairePourcentage paieP) {
		super(nom, numero, age, paieH, paieP);
	}
	
	public Cadre(String nom, String numero, int age, double nbHeuresT, double CAffaires, double HSup, double prixH) {
		super(nom, numero, age, nbHeuresT, CAffaires, HSup, prixH);
		paieH = new SalaireCadre();
		
	}
}
