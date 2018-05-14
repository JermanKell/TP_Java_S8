package TP1_Gestion_employés;

public class SalaireCollaborateur implements SalaireTauxHeures{
	private SalaireCommercial comm = null;

	public SalaireCollaborateur() {
	comm = new SalaireCommercial(); 
	}

	@Override
	public float getSalaire(float nbHTrav, float nbHSup, float prixH, float CA) {
		float sal1 = comm.getSalaire(CA);
		float prixHSup = (float) (1.5 * prixH);
		float sal2;
		
		sal2 = (nbHTrav * prixH) + (nbHSup * prixHSup);
		return sal1 + sal2;
	}

	

}
