package TP1_Gestion_employés;


public abstract class Employe {
	protected String nom;
	protected int age;
	protected String numTel;
	protected float salaire;
	
	protected SalaireTauxHeures paieH = null;
	protected SalairePourcentage paieP = null;
	
	/**
	 * Nombre d'heures travaillées
	 */
	protected float nbHTrav;
	
	/**
	 * Chiffre d'affaires fait (cadre ou collaborateur)
	 */
	protected float CAffaires;
	
	/**
	 * Nombre d'heures supplémentaires faites
	 */
	protected float tauxHSup;
	
	/**
	 * Coût d'une heure de travail
	 */
	protected float coutH;
	
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
	public Employe(String nom, String numero, int age,float nbHeuresT, float CAffaires, float HSup, float prixH, SalaireTauxHeures paieH, SalairePourcentage paieP) {
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
	 * Méthode polymorphe d'accès au salaire 
	 * @return 
	 */
	public float SalaireAccesseur() {
		float salaire = 0;
		
		if ((paieH != null) && (paieP == null))		salaire = paieH.getSalaire(nbHTrav, tauxHSup, coutH, CAffaires);	
		else if ((paieH == null) && (paieP != null))	salaire = paieP.getSalaire(CAffaires);

		return salaire;
	}
	
	public String decrisToi() {
		String chaine = "Je suis " + nom + " et je gagne " + salaire + ".";
		return chaine;
	}
}
