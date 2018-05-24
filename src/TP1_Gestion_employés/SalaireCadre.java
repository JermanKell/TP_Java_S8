package TP1_Gestion_employés;

public class SalaireCadre implements SalaireTauxHeures {

	@Override
	public double getSalaire(double nbHTrav, double nbHSup, double prixH, double CA) {
		double salaire;
		double prixHSup = (double) (1.5 * prixH);
		
		salaire = (nbHTrav * prixH) + (nbHSup * prixHSup);
		
		return salaire;
	}

}
