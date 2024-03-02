package lesschtroumpfs;


public class Village {
	
	// 4.1 Les attributs
	
	private String nom;
	private Schtroumpf[] lesSchtroumpfs;
	private int nbSchtroumpfs;
	private int stockSalsepareille;
	
	// 4.2 Le constructeurs
	
	/*
	 * @param IN String pfNomV : Nom du village
	 * @param IN int pfStockSalsePareille : Nombre de feuilles de salsepareille en stock
	 * @param IN String[] pfNomsDesSchtroumpfs : Noms des Schtroumpfs 
	 */
	public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
		this.nom = pfNomV;
		this.stockSalsepareille = pfStockSalsepareille;
		this.lesSchtroumpfs = new Schtroumpf[100];
		
		// Ajout des Schtroumpfs dans le tableau de Schtroumpf lesSchtroumpfs
		for (int i = 0; i < pfNomsDesSchtroumpfs.length; i++) {
			this.lesSchtroumpfs[i] = new Schtroumpf(pfNomsDesSchtroumpfs[i], (int)(Math.random()*150), this);
		}
		
		// Nb de Schtroumpfs
		this.nbSchtroumpfs = pfNomsDesSchtroumpfs.length;
	}
	
	//4.3 Les methodes
	
	/*
	 * Permet d'obtenir le nom du Village
	 */
	public String getNom() {
		return this.nom;
	}
	
	/*
	 * Permet d’obtenir le nombre de Schtroumpfs qui vivent dans le Village.
	 */
	public int getNbSchtroumpfs() {
		return this.nbSchtroumpfs;
	}
	
	/*
	 * Permet d’obtenir le nombre de feuilles de salsepareille dans le stock du Village.
	 */
	public int getStockSalsepareille() {
		return this.stockSalsepareille;
	}
	
	/*
	 * Permettant de fêter le passage de la solstice d'ete
	 */
	public void solstice_d_ete() {
		
		// Nombre de Schtroumpfs presents
		int nbPresents = 0;
		
		// Nombre de Schtroumpfs contents
		int nbContents = 0;
		
		// Presentation et chanson de chaque Schtroumpf
		for (int i = 0; i < this.nbSchtroumpfs; i++) {
			this.lesSchtroumpfs[i].sePresenter();
			this.lesSchtroumpfs[i].chanter();
			nbPresents ++;
			
			if (this.lesSchtroumpfs[i].estContent() == true) {
				nbContents ++;
			}
		}
		
		// Affichage du nom du Village, le nb de Schtroumpfs presents et le nb de Schtroumpfs contents
		System.out.println("\n");
		System.out.println("Nom du village lors de la fete : " + this.nom + 
		"\nNombre de Schtroumpfs presents lors de la fete : "+ nbPresents +
		"\nNombre de Schtroumpfs contents ce jour la : " + nbContents + "\n");
	}
	
	/*
	 * Permet d’obtenir le chef du village
	 */
	public Schtroumpf chefDuVillage() {
		
		// Schtroumpf le plus age
		Schtroumpf schtroumpfPlusAge = this.lesSchtroumpfs[0];
		
		// Recuperation du Schtroumpf le plus age
		for (int i = 1; i < this.nbSchtroumpfs; i++) {
			
			// Comparaison entre i et i+1
			if (this.lesSchtroumpfs[i].getAge() > schtroumpfPlusAge.getAge()) {
				schtroumpfPlusAge = this.lesSchtroumpfs[i];
			}
		}
		
		return schtroumpfPlusAge;
	}
	
	/*
	 * Permet d'envoyer des Schtroumpfs travailler (seulement parmi les Schtroumpfs heureux)
	 */
	public void envoyerAuTravail() {
		

		// Recuperation des Schtroumpfs heureux

		// Tableau qui conntient les Schtroumpfs heureux
		Schtroumpf[] SchtroumpfHeureux = new Schtroumpf[this.nbSchtroumpfs];

		// Nombre de Schtroumpfs heureux
		int cptSH = 0;

		// Ajout des Schtroumpfs heureux dans le tableau
		for (int i = 0; i < this.nbSchtroumpfs; i++) {
			if (this.lesSchtroumpfs[i].estContent() == true) {
				SchtroumpfHeureux[cptSH] = this.lesSchtroumpfs[i];
				cptSH ++;
			}
		}

		// Nombre de Schtroumpfs heureux
		int nbSchtroumpfsHeureux = cptSH;

		// Seulement la motie des Schtroumpfs heureux vont travailler
		// Envoi d'un Schtroumpf sur 2 au travail
		for (int i = 0; i < nbSchtroumpfsHeureux; i += 2) {
			SchtroumpfHeureux[i].allerTravailler();
		}
	}
	
	/*
	 * Permet de presenter et faire chanter les seuls Schtroumpfs heureux du village
	 */
	public void schtroumpfsHeureux() {
		
		// Presentation et chant des Schtroumpfs heureux
		for (int i = 0; i < this.nbSchtroumpfs; i ++) {
			
			// Verification pour savoir si le Schtroumpf est heureux ou pas
			if (this.lesSchtroumpfs[i].estContent()) {
				
				this.lesSchtroumpfs[i].sePresenter();
				this.lesSchtroumpfs[i].chanter();
			}
		}
	}
	
	// 5.2 Q1 1.
	/*
	 * Permet de gerer le stock de salsepareille
	 * @param IN int pfSalsePareille : > 0 alors + dans le stock ; < 0 alors - dans le stock
	 */
	public void gererStockSalsepareille(int pfSalsepareille) {
		this.stockSalsepareille += pfSalsepareille;
	}

	// 5.2 Q1 3.
	/*
	 * Permet au Sdchtroumpfs du village de diner tous ensembles
	 */
	public void dinerTousEnsemble() {
		
		// Tous les Schtroumpfs mangent 
		for (int i = 0; i < this.nbSchtroumpfs; i ++) {
			this.lesSchtroumpfs[i].dinerAuVillage();
		}
	}

	// 5.2 Q1 4.
	/*
	 * Permet d'envoyer cueillir de la salsepareille 1 Schtroumpf sur 2
	 */
	public void envoyerCueillirSalsepareille() {

		// Recuperation des Schtroumpfs heureux

		// Tableau qui conntient les Schtroumpfs heureux
		Schtroumpf[] SchtroumpfHeureux = new Schtroumpf[this.nbSchtroumpfs];

		// Nombre de Schtroumpfs heureux
		int cptSH = 0;

		// Ajout des Schtroumpfs heureux dans le tableau
		for (int i = 0; i < this.nbSchtroumpfs; i++) {
			if (this.lesSchtroumpfs[i].estContent() == true) {
				SchtroumpfHeureux[cptSH] = this.lesSchtroumpfs[i];
				cptSH ++;
			}
		}

		// Nombre de Schtroumpfs heureux
		int nbSchtroumpfsHeureux = cptSH;

		// Seulement la motie des Schtroumpfs heureux vont travailler
		// Envoi d'un Schtroumpf sur 2 au travail
		for (int i = 0; i < nbSchtroumpfsHeureux; i += 2) {
			SchtroumpfHeureux[i].recolterSalsepareille();
		}
	}

	
}	
