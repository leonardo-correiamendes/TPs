
// 3) 1. La classe hérite de quelle autre classe ? Quel mot clef signale cet héritage ?
// La classe herite de la classe FormeGraphique. Le mot clef est extends 
public class Rectangle extends FormeGraphique {
	
	//2. Quels sont les attributs définis par la classe Rectangle ?
	// Les attributs definis par la classe Rectaangle sont : largeur et longueur
	private int largeur ;
	private int longueur ;
	
	// 3. Combien la classe a-t-elle de constructeur(s) ?
	// La classe a 2 contructeurs
	// 1er constructeur
	public Rectangle() {
		super();
		this.largeur = 0 ;
		this.longueur = 0 ;
	}
	
	// 2eme constructeur
	public Rectangle(int pfX, int pfY, int pfLarg, int pfLong) {
		super(pfX, pfY);
		this.largeur = pfLarg ;
		this.longueur = pfLong ;
	}
	
	// 4. Combien la classe définit-elle d’accesseur(s) (dans le code même de la classe) ?
	// La classe definit autant de getter qu'il y a d'attributs, donc 2
	// 1er getter
	public int getLargeur() {
		return this.largeur ;
	}
	
	// 2eme getter
	public int getLongueur() {
		return this.longueur ;
	}

	// 5. Combien la classe définit-elle de transformateur(s) (dans le code même de la classe) ?
	// La classe definit autant de setter qu'il y a d'attributs, donc 2
	// 1er setter
	public void setLargeur(int pfLargeur) {
		this.largeur = pfLargeur;
	}

	// 2eme setter
	// 6. La méthode setLongueur() est-elle une nouvelle méthode par rapport à FormeGraphique (existerait-elle si elle n’était pas 
	// écrite dans Rectangle) ?
	// Oui la methode setLongueur() est nouvdlle. Non elle n'existerait pas si elle n'etait pas ecrite dans Rectangle
	public void setLongueur(int pfLongueur) {
		this.longueur = pfLongueur;
	}

	// 7. La méthode surface() est-elle une nouvelle méthode par rapport à FormeGraphique (existerait-elle si elle n’était pas écrite 
	// dans Rectangle) ?
	// Non la methode surface() n'est pas une nouvelle methode. Oui elle existerait si elle n'etait pas ecrite dans Rectangle
	public double surface() {
		return this.longueur * this.largeur ;
	}

	// 8. La méthode afficher() est-elle une nouvelle méthode par rapport à FormeGraphique (existerait-elle si elle n’était pas écrite dans 
	// Rectangle) ?
	// Non la methode afficher() n'est pas une nouvelle methode. Oui elle existerait si elle n'etait pas ecrite dans Rectangle. 
	// Elle Override la methode afficher de FormeGraphique
	/*
	 * @Override
	 */
	public void afficher() {
		super.afficher();
		System.out.println("Rectangle : hauteur " + this.longueur + " largeur " + this.largeur);
	}

	// 9. La méthode volume() existe-elle pour les objets de type Rectangle ? Si oui : quelle valeur renverra-t-elle ? Si non : pourquoi ?
	// Oui elle existe pour le type Rectangle car celui-ci herite de FormeGraphique qui contient volume(). Celle-ci renvoie 0 par defaut.

	// 10. Qu’affiche la méthode afficher() de la classe Rectangle lorsqu’on l’utilise ? Donner un exemple de résultat.
	// Exemple de resultat : "Forme graphique : abscisse {abcisse} ordonnee {ordonnee}
	// 						  Rectangle : hauter {longueur du rectangle} largeur {largeur du rectangle}"

	// 11. Que réalise la ligne super.afficher(); dans la méthode afficher() ?
	// Cette ligne affiche : "Forme graphique : abscisse {abcisse} ordonnee {ordonnee}

	// 12. Que réalise la ligne super(pfX, pfY); au début du constructeur public Rectangle(int pfX, int pfY, int pfLarg, int pfLong) ?
	// Cette ligne permet d'appeler le contructeur qui initialise l'abscisse a pfX et l'ordonnee a pfY 
	// (les 2 sont initialisees a 0 par defaut)

	// 13. La constructeur Rectangle() appelle-t-il un constructeur de la classe FormeGraphique ? Lequel ?
	// Oui, ce constructeur appele le constructeur sans parametres de la classe FormeGraphique

	// 14. Donner l’interface d’un objet de la classe Rectangle, c’est-à-dire la liste des méthodes disponibles en séparant :

	// Les méthodes définies dans la classe (non héritées).
	// getLargeur(), getLongueur(), setLargeur(), setLongueur(), 
	
	// Les méthodes héritées mais redéfinies dans Rectangle.
	// surface()

	// Les méthodes héritées non redéfinies.
	// afficher()

	// Les constructeurs de la classe Rectangle utilisables.
	// Rectangle(), Rectangle(int pfX, int pfY, int pfLarg, int pfLong)

	// 15. Écrire un petit test de la classe dans la méthode main() déjà proposée.
	// Fait dans HeritageTestFG3D.java

}