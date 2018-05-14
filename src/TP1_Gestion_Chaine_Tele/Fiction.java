package TP1_Gestion_Chaine_Tele;

public interface Fiction {	
	String getNom();
	void setNom(String nom);
	
	int getAnneeRea();
	void setReaAnnee(int annee);
	
	String getNomRea();
	void setNomRea(String nom);
	
	void setRedif(boolean redif);
	boolean IsARedif();
}
