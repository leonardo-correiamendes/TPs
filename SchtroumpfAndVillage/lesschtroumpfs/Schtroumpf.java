package lesschtroumpfs;

public class Schtroumpf {
	
	// 3.1 Les attributs
	private String nom;
	private int age;
	private boolean content;
	
	// 5.1 1.
	private Village villageHabitation;
	
	// 3.2 Les connstructeurs
	public Schtroumpf(String pfNom, int pfAge) {
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		
		// 5.1 2.Un Schtroumpf sans village est ermite
		this.villageHabitation = null;
	}
	
	// 5.1  3.
	public Schtroumpf(String pfNom, int pfAge, Village pfVillage) {
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.villageHabitation = pfVillage;
	}
	
	// 3.3
	// Les methodes
	
	/*
	 * Return le nom du Schtroumpf
	 */
	public String getNom() {
		return this.nom;
	}
	
	/*
	 * Return l'age du Schtroumpf
	 */
	public int getAge() {
		return this.age;
	}
	
	/*
	 * Return true si le Schtroumpf est content, false sinon
	 */
	public boolean estContent() {
		return this.content;
	}
	
	// 5.1 4.
	/*
	 * Retourne le village du Schtroumpf
	 * Si le return est null alors le Schtroumpf est un ermite
	 */
	public Village getVillage() {
		return this.villageHabitation;
	}
	
	/*
	 * Permet de modifier le Village du Schtroumpf
	 */
	public void setVillage(Village pfVillage) {
		this.villageHabitation = pfVillage;
	}
	
	/*
	 * Return un message qui presente le Schtroumpf (toutes ses
	 * caracteristiques)
	 */
	public String toString() {
		
		// Message
		String msg = "Je suis " + this.nom + ", j'ai " +
		this.age + " ans et je suis ";
		
		// Etat
		if (this.content) {
			msg += "content.";
		} else {
			msg += "PAS content.";
		}
		
		// 5.1 5.
		if (this.villageHabitation == null) {
			msg += " Je suis ermite.";
		} else {
			msg += " Je viens du village : " + this.villageHabitation;
		}
		
		return msg;
	}
	
	/*
	 * Affiche la présentation du Schtroumpf
	 * @see toString
	 */
	public void sePresenter() {
		
		// Presentation
		String presentation = "";
		
		// Affecte la presentation du pfSchtroumpf a la variable presentation
		presentation = this.toString();
		
		// Affiche la presentation
		System.out.println(presentation);
	}
	
	/*
	 * Retourne le chant du pfSchtroumpf selon son etat
	 */
	public String leChant() {
		
		// Declaration du chant
		String chant = "";
		
		// Verification de l'etat du Schtroumpf
		if (this.content) {
			chant += "la, la, la Schtroumpf la, la";
		} else {
			chant += "gloups";
		}
		
		return chant;
	}
	
	/*
	 * Affiche le chant de pfSchtroumpf
	 * @see leChant
	 */
	public void chanter() {
		
		// Le chant
		String chant = this.leChant();
		
		// Affiche le chant
		System.out.println(chant);
	}
	
	/*
	 * Permet au Schtroumpf de gagner 1 an
	 */
	public void anniversaire() {
		this.age += 1;
	}
	
	/*
	 * Permet au Schtroumpf de s'alimenter d'une quantite de pfQte en salsepareille
	 * @param IN int pfQte : quantite de salsepareille consommee
	 * @prec pfQte > 0 sinon il ne mange pas réellement
	 */
	public void manger(int pfQte) {
		
		// Verification de la prec
		if (pfQte > 0) {
			this.content = true;
		}
	}
	
	/*
	 * Permet d'envoyer un Schtroumpf aller travailler au pont. Il devient triste (pas content)
	 */
	public void allerTravailler() {
		this.content = false;
	}
	
	// 5.2 Q1 1.
	/*
	 * Permet au Schtroumpf d'aller recolter de la salsepareille
	 */
	public void recolterSalsepareille( ) {
		
		// Recolte 5 salsepareille a chaque fois
		int salsePareilleR = 5;
		
		// Pas de village alors il mange la salsepareille recoltee
		if (this.villageHabitation == null) {
			this.manger(salsePareilleR);
		} else {
			this.villageHabitation.gererStockSalsepareille(salsePareilleR);
			this.content = false;
		}
	}
	
	// 5.2 Q1 2.
	/*
	 * Permet au Schtroumpf de diner
	 */
	public void dinerAuVillage() {
		
		// Quand un Schtroumpf dine alors il mange 3 salsepareille
		
		// Nombre de salsepareille a enlever du stock de salsepareille du village
		int salsepareilleStock = -3;
		// Nombre de salsepareille mangee par le Schtroumpf
		int salsepareilleM = 3;
		
		// Un Schtroumpf mange seulement si il a un village et qu'il y'a assez pour lui dans le stock de celui-ci
		if ((this.villageHabitation != null) && (this.villageHabitation.getStockSalsepareille() >= 3)) {
			this.manger(salsepareilleM);

			// Modifie le stock du village
			this.villageHabitation.gererStockSalsepareille(salsepareilleStock);

		// S'il n'as pas de village alors il devient triste
		} else if (this.villageHabitation == null) {
			this.content = false;
		}
	}
}		
