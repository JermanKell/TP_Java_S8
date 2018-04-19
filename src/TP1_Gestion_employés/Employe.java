package TP1_Gestion_employés;


public abstract class Employe {
	protected String nom;
	protected int age;
	protected String numTel;
	protected float salaire;
	
	protected SalaireTauxHeures paieH = null;
	protected SalairePourcentage paieP = null;
	
	protected float nbHTrav;
	protected float CAffaires;
	protected float tauxHSup;
	protected float coutH;
	
	
	public Employe() {
		
	}
	
	public Employe(String nom, String numero, int age, SalaireTauxHeures paieH, SalairePourcentage paieP) { 
		this.nom = nom;
		numTel = numero;
		this.age = age;
		this.paieH = paieH;
		this.paieP = paieP;
	}
	
	public void setInfosSalaire(float nbHeuresT, float CAffaires, float HSup) {
		nbHTrav = nbHeuresT;
		this.CAffaires = CAffaires;
		tauxHSup = HSup;
	}
	
	public float getSalaire() {
		if ((paieH!=null) && (paieP == null))
			salaire = paieH.CalculSalaireH();
		else if ((paieH == null) && (paieP != null))
			salaire = paieP.CalculSalaireP();
		
		return salaire;
	}
	
	public String decrisToi() {
		String chaine = "Je suis " + nom + " et je gagne " + salaire + ".";
		return chaine;
	}
}
