package TP1_Gestion_employés;

public class SalaireCollaborateur implements SalaireTauxHeures{
	private SalaireCommercial comm = null;

	public SalaireCollaborateur() {
	comm = new SalaireCommercial(); 
	}

	@Override
	public double getSalaire(double nbHTrav, double nbHSup, double prixH, double CA) {
		double sal1 = comm.getSalaire(CA);
		double prixHSup = (double) (1.5 * prixH);
		double sal2;
		
		sal2 = (nbHTrav * prixH) + (nbHSup * prixHSup);
		return sal1 + sal2;
	}

	

}
