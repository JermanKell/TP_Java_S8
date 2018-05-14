package TP1_Gestion_Chaine_Tele;

public class DocumentaireAnimalier extends Documentaire{

	public DocumentaireAnimalier(String nom, int duree) {
		super(nom, duree);
	}
	
	public DocumentaireAnimalier(String nom, int duree, String theme) {
		super(nom, duree);
		Theme = theme;
	}

}
