package TP1_Gestion_employ�s;

public interface SalaireTauxHeures {
	/**
	 * M�thode de calcul du salaire pour les ouvriers
	 * @return	Salaire approximatif en euros
	 */
	public float getSalaire(float nbHTrav, float nbHSup, float prixH, float CA);

}
