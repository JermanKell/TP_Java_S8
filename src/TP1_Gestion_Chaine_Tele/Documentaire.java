package TP1_Gestion_Chaine_Tele;

public class Documentaire extends Emission implements Reportage{
	protected String Theme;
	
	public Documentaire(String nom, int duree) {
		super(nom, duree);
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
	public void setTheme(String theme) {
		Theme = theme;
	}

	@Override
	public String getTheme() {
		return Theme;
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
