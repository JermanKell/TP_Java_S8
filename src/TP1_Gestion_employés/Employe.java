package TP1_Gestion_employ�s;


public abstract class Employe {
	protected String nom;
	protected int age;
	protected String numTel;
	protected float salaire;
	
	protected SalaireTauxHeures paieH = null;
	protected SalairePourcentage paieP = null;
	
	/**
	 * Nombre d'heures travaill�es
	 */
	protected double nbHTrav;
	
	/**
	 * Chiffre d'affaires fait (cadre ou collaborateur)
	 */
	protected double CAffaires;
	
	/**
	 * Nombre d'heures suppl�mentaires faites
	 */
	protected double tauxHSup;
	
	/**
	 * Co�t d'une heure de travail
	 */
	protected double coutH;
	
	/**
	 * Constructeur d'objet Employe
	 * @param nom
	 * @param numero
	 * @param age
	 * @param paieH
	 * @param paieP
	 */
	public Employe(String nom, String numero, int age, SalaireTauxHeures paieH, SalairePourcentage paieP) { 
		this.nom = nom;
		numTel = numero;
		this.age = age;
		this.paieH = paieH;
		this.paieP = paieP;
	}
	
	public Employe(String nom, String numero, int age,double nbHeuresT, double CAffaires, double HSup, double prixH) {
		this.nom = nom;
		numTel = numero;
		this.age = age;
		nbHTrav = nbHeuresT;
		this.CAffaires = CAffaires;
		tauxHSup = HSup;
		coutH = prixH;
	}
	
	/**
	 * Constructeur d'objet Employe 
	 * @param nom
	 * @param numero
	 * @param age
	 * @param nbHeuresT
	 * @param CAffaires
	 * @param HSup
	 * @param paieH
	 * @param paieP
	 */
	public Employe(String nom, String numero, int age, double nbHeuresT, double CAffaires, double HSup, double prixH, SalaireTauxHeures paieH, SalairePourcentage paieP) {
		this.nom = nom;
		numTel = numero;
		this.age = age;
		nbHTrav = nbHeuresT;
		this.CAffaires = CAffaires;
		tauxHSup = HSup;
		coutH = prixH;

		this.paieH = paieH;
		this.paieP = paieP;
	}
	
	public String getNom() {
		return nom;
	}
	
	/**
	 * M�thode polymorphe d'acc�s au salaire 
	 * @return 
	 */
	public double SalaireAccesseur() {
		double salaire = 0;
		
		if ((paieH != null) && (paieP == null))		salaire = paieH.getSalaire(nbHTrav, tauxHSup, coutH, CAffaires);	
		else if ((paieH == null) && (paieP != null))	salaire = paieP.getSalaire(CAffaires);

		return salaire;
	}
}
