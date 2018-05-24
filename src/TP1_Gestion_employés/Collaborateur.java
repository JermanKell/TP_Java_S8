package TP1_Gestion_employés;

public class Collaborateur extends Employe{

	public Collaborateur(String nom, String numero, int age, double nbHeuresT, double CAffaires, double HSup, double prixH,
			SalaireTauxHeures paieH, SalairePourcentage paieP) {
		super(nom, numero, age, nbHeuresT, CAffaires, HSup, prixH, paieH, paieP);
	}
	
	public Collaborateur(String nom, String numero, int age, SalaireTauxHeures paieH, SalairePourcentage paieP) {
		super(nom, numero, age, paieH, paieP);
	}
	
	public Collaborateur(String nom, String numero, int age, double nbHeuresT, double CAffaires, double HSup, double prixH) {
		super(nom, numero, age, nbHeuresT, CAffaires, HSup, prixH);
		paieH = new SalaireCollaborateur();
	}
}
