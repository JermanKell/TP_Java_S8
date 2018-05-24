package TP1_Gestion_Chaine_Tele;

public class Mangas extends Emission implements Divertissement, Fiction{
	private int ReaAnnee;
	private String ReaNom;
	
	public Mangas(String nom) {
		super(nom, 2);
		Redif = false;
	}
	
	public Mangas(String nom, int duree, int annee, String nomRea, boolean redif) {
		super(nom, duree);
		ReaAnnee = annee;
		ReaNom = nomRea;
		Redif = redif;
	}

	@Override
	public int getAnneeRea() {
		return ReaAnnee;
	}

	@Override
	public void setReaAnnee(int annee) {
		ReaAnnee = annee;
		
	}

	@Override
	public String getNomRea() {
		return ReaNom;
	}

	@Override
	public void setNomRea(String nom) {
		ReaNom = nom;
		
	}

	@Override
	public void setRedif(boolean redif) {
		Redif = redif;		
	}

	@Override
	public boolean IsARedif() {
		return Redif;
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
