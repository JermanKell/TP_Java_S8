package TP1_Gestion_Chaine_Tele;

public class DocumentaireCulturel extends Documentaire{

	public DocumentaireCulturel(String nom, int duree) {
		super(nom, duree);
	}
	
	public DocumentaireCulturel(String nom, int duree, String theme) {
		super(nom, duree);
		Theme = theme;
	}
}
