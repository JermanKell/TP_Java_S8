package TP1_Gestion_Chaine_Tele;

public class Jeux extends Emission implements Divertissement{
		
	public Jeux(String nom) {
		super(nom, 2);
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
		
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setDuree(int duree) {
		this.duree = duree;
	}

	@Override
	public int getDuree() {
		return duree;
	}
}
