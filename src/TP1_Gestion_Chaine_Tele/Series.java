package TP1_Gestion_Chaine_Tele;

public class Series extends Emission implements Divertissement, Fiction{	
	private int ReaAnnee;
	private String ReaNom;
	private boolean Redif;
	
	public Series(String nom, int duree) {
		super(nom, duree);
	}
	
	public Series(String nom, int duree, int annee, String nomRea, boolean redif) {
		super(nom, duree);
		ReaAnnee = annee;
		ReaNom = nomRea;
		Redif = redif;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
		
	}

	@Override
	public void setDuree(int duree) {
		this.duree = duree;
		
	}

	@Override
	public int getDuree() {
		return duree;
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

}
