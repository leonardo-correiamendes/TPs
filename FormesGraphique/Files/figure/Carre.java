
// 4.3.4) 1. un héritage éventuel pour la classe
/**
 * Classe representant un Carre
 */
public class Carre extends FormeGraphique {
    
    // 2. le(s) attribut(s) nécessaire(s)
    // La classe Carre est un rectangle particulier de largeur égale à la hauteur, appelée côté.
    private int longueur;
    private int hauteur;

    // 3. un constructeur par défaut initialisant les coordonnées du coin supérieur gauche à 0 ainsi que le côté à 0
    /**
     * Constructeur sans parametre
     */
    public Carre() {
        super();
        this.longueur = 0;
        this.hauteur = 0;
    }

    // 4. un constructeur paramétré permettant d’initialiser correctement un carré : les coordonnées du coin supérieur gauche et la 
    // longueur du côté
    /**
     * Constructeur parametre
     * 
     * @param pfCoinGX IN : coin gauche en X du carre
     * @param pfCoinGY IN : coin gauche en Y du carre 
     * @param pfLongueur IN : longueur du carre
     */
    public Carre(int pfCoinGX, int pfCoingGY, int pfLongueur) {
        super(pfCoinGX, pfCoingGY);
        this.longueur = pfLongueur;
        this.hauteur = pfLongueur;
    }

    // 5. une méthode accesseur (get) pour chaque attribut défini
    /**
     * Retourne la longeur du carre
     * 
     * @return longeur du carre
     */
    public int getLongueur() {
        return this.longueur;
    }

    /**
     * Retourne la hauteur du carre
     * 
     * @return hauteur du carre
     */
    public int getHauteur() {
        return this.hauteur;
    }

    // 6. une méthode getCote() permettant d’obtenir le cote d’un carré
    /**
     * Retourne le cote du carre
     * 
     * @return cote du carre
     */
    public int getCote() {
        return this.longueur;
    }

    // 7. une méthode transformateur (set) pour chaque attribut défini
    /**
     * Permet de modifier la longueur du carre
     * 
     * @param pfLongueur IN : nouvelle longueur du carre
     */
    public void setLongueur(int pfLongueur) {
        this.longueur = pfLongueur;
        this.hauteur = pfLongueur;
    }

    /**
     * Permet de mofifier la hauteur du carre
     * 
     * @param pfHauteur IN : nouvelle hauteur du carre
     */
    public void setHauteur(int pfHauteur) {
        this.hauteur = pfHauteur;
        this.longueur = pfHauteur;
    }

    // 8. à réfléchir : la méthode qui calcule la surface d’un carré (rappel : coté x coté)
    public double surface() {
        return longueur * hauteur;
    }

    // 9. la méthode afficher permettant d’afficher à l’écran le texte suivant. On appellera obligatoirement la méthode afficher() de 
    // la classe parente.
    // Texte a afficher : Forme graphique : abscisse ~valeur abcisse~ ordonnée ~valeur ordonnée
    //                    Rectangle : hauteur ~valeur hauteur~ largeur ~valeur largeur~
    //                    Carré : côté ~valeur coté~
    public void afficher() {
        super.afficher();
        System.out.println("Rectangle : hauteur " + this.getHauteur() + " ordonnee " + this.getLongueur());
        System.out.println("Carre : cote " + this.getLongueur());
    }
}
