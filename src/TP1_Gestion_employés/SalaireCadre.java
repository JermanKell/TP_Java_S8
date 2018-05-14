package TP1_Gestion_employés;

public class SalaireCadre implements SalaireTauxHeures {

	@Override
	public float getSalaire(float nbHTrav, float nbHSup, float prixH, float CA) {
		float salaire;
		float prixHSup = (float) (1.5 * prixH);
		
		salaire = (nbHTrav * prixH) + (nbHSup * prixHSup);
		
		return salaire;
	}

}
