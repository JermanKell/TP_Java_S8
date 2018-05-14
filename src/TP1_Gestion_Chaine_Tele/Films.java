package TP1_Gestion_Chaine_Tele;

public class Films extends Emission implements Fiction{
	private String ReaNom;
	private int ReaAnnee;
	private boolean Redif;
	
	public Films(String nom, int duree) {
		super(nom, duree);
	}
	
	public Films(String nom, int duree, String nomRea, int annee, boolean redif) {
		super(nom, duree);
		ReaNom = nomRea;
		ReaAnnee = annee;
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
