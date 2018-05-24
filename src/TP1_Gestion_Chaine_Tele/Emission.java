package TP1_Gestion_Chaine_Tele;

public class Emission {
	protected String nom;
	protected int duree;
	protected boolean Redif = false;
	
	public Emission(String nom, int duree) {
		this.nom = nom;
		this.duree = duree;
	}
	
	public boolean IsARedif() {
		return Redif;
	}
}
