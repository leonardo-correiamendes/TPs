package lesschtroumpfs;

public class Schtroumpf {
	private String nom;
	private int age;
	private boolean content;
	private Village village;
	
	public Schtroumpf (String pfNom, int pfAge) {
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.village = null;
	}
	
	public Schtroumpf (String pfNom, int pfAge, Village pfVillage) {
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.village = pfVillage;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean estContent() {
		return this.content;
	}
	
	public Village getVillage() {
		return this.village;
	}
	
	public void setVillage(Village pfV) {
		this.village = pfV;
	}
	
	
	
	public String toString () {
		String etat = "";
		if (estContent()) {
			etat = "content.";
		}
		else {
			etat = "PAS content.";
		}
		String villageOuPas = "";
		if (this.village != null) {
			villageOuPas = "Et je viens de " + village.getNomV() + ".";
		} else {
			villageOuPas = "Et je suis ermite.";
		}
		return "Je suis " + this.nom + ", j'ai " + this.age + " ans et je suis " + etat + villageOuPas;
	}
	
	public void sePresenter () {
		System.out.println(this.toString());
	}
	
	public String leChant() {
		String chant = "";
		if (estContent()) {
			chant = "la, la, la Schtroumpf la, la";
		}
		else {
			chant = "gloups";
		}
		return chant;
	}
	
	public void chanter() {
		System.out.println(this.leChant());
	}
	
	public void anniversaire() {
		this.age ++;
	}
	
	public void manger(int pfQte) {
		if (pfQte > 0) {
			this.content = true;
		}
	}
	
	public void allerTravailler() {
		this.content = false;
	}
	
	public void recolterSalsepareille() {
		this.village.ajoutStockSalsepareille(5);
		this.content = false;
	}
	
	public void dinerAuVillage() {
		this.village.retraitStockSalsepareille(3);
		this.content = true;
	}
}
