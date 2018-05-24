package TP1_Gestion_employés;

public class SalaireCommercial implements SalairePourcentage{

	@Override
	public double getSalaire(double cA)  {
		double salaire = (double) (cA * 0.09);
		return salaire;
	}
	
}
