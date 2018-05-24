package TP1_Gestion_employés;

public class SalaireOuvrier implements SalaireTauxHeures{

	@Override
	public double getSalaire(double nbHTrav, double nbHSup, double prixH, double CA) {
		double salaire;
		double prixHSup = (double) (1.3 * prixH);
		
		salaire = (nbHTrav * prixH) + (nbHSup * prixHSup);
		
		return salaire;
	}

}
