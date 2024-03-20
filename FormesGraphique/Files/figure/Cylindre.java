
// 4.3.2) 1. un héritage éventuel pour la classe 
public class Cylindre extends FormeGraphique {
    
    // 2. le(s) attribut(s) nécessaire(s)
    // La classe Cylindre est définie comme un cercle avec en plus une hauteur (double).
    private double rayon;
    private int hauteur;

    // 3. un constructeur par défaut initialisant les coordonnées du centre à 0, le rayon à 0 ainsi que la hauteur à 0
    public Cylindre() {
        super();
        this.rayon = 0;
        this.hauteur = 0;
    }

    // 4. un constructeur paramétré permettant d’initialiser correctement toutes les données d’un Cylindre
    public Cylindre(int pfCentreX, int pfCentreY, double pfRayon, int pfHauteur) {
        super(pfCentreX, pfCentreY);
        this.rayon = pfRayon;
        this.hauteur = pfHauteur;
    }

    // 5. une méthode accesseur (get) pour chaque attribut défini
    public double getRayon() {
        return this.rayon;
    }

    public int getHauteur() {
        return this.hauteur;
    }

    // 6. une méthode transformateur (set) pour chaque attribut défini
    public void setRayon(double pfRayon) {
        this.rayon = pfRayon;
    }

    public void setHauteur(int pfHauteur) {
        this.hauteur = pfHauteur;
    }

    // 7. la méthode surface() qui calcule la surface d’un Cylindre (rappel : 2 x Π x R x H + 2 x Π x R2)
    public double surface() {
        return ((2 * Math.PI * this.rayon * this.hauteur) + (2 * Math.PI * Math.pow(rayon, rayon)));
    }

    // 8. la méthode volume() qui calcule le volume d’un Cylindre (rappel : Π x R2 x H)
    public double volume() {
        return (Math.PI * Math.pow(rayon, rayon) * this.hauteur);
    }

    // 9. la méthode afficher() permettant d’afficher à l’écran le texte suivant. On appellera obligatoirement la méthode afficher() de 
    // la classe parente.
    // Texte a afficher : Forme graphique : abscisse ~valeur abcisse~ ordonnée ~valeur ordonnée~
    //                    Cercle : rayon ~valeur rayon~
    //                    Cylindre : hauteur ~valeur hauteur~
    public void afficher() {
        super.afficher();
        System.out.println("Cercle : rayon " + this.getRayon());
        System.out.println("Cylindre : hauteur " + this.getHauteur());
    }
}
