package TP1_Gestion_employ�s;

public class SalaireCommercial implements SalairePourcentage{

	@Override
	public float getSalaire(float CA)  {
		float salaire = (float) (CA * 0.09);
		return salaire;
	}
	
}
