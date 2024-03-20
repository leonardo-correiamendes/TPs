
// 4.3.3) 1. un héritage éventuel pour la classe
public class Sphere extends FormeGraphique {
    
    // 2. le(s) attribut(s) nécessaire(s)
    // La classe Sphere est définie comme un cercle et a une surface et un volume
    private double rayon;

    // 3. un constructeur par défaut initialisant les coordonnées du centre à 0 ainsi que le rayon à 0
    public Sphere() {
        super();
        this.rayon = 0;
    }

    // 4. un constructeur paramétré permettant d’initialiser correctement toutes les données d’une Sphere
    public Sphere(int pfCentreX, int pfCentreY, double pfRayon) {
        super(pfCentreX, pfCentreY);
        this.rayon = pfRayon;
    }

    // 5. une méthode accesseur (get) pour chaque attribut défini
    public double getRayon() {
        return this.rayon;
    }

    // 6. une méthode transformateur (set) pour chaque attribut défini
    public void setRayon(double pfRayon) {
        this.rayon = pfRayon;
    }

    // 7. la méthode surface() qui calcule la surface d’une Sphere (rappel : 4 x Π x R2)
    public double surface() {
        return (4 * Math.PI * Math.pow(rayon, rayon));
    }

    // 8. la méthode volume() qui calcule le volume d’une Sphere (rappel : 4 x Π x R3 / 3)
    public double volume() {
        return ((4 * Math.PI * (Math.pow(rayon, rayon) * rayon)) / 3);
    }

    // 9. la méthode afficher() permettant d’afficher à l’écran le texte suivant. On appellera obligatoirement la méthode afficher() de 
    // la classe parente
    // Texte a afficher : Forme graphique : abscisse ~valeur abcisse~ ordonnée ~valeur ordonnée~
    //                    Cercle : rayon ~valeur rayon~
    //                    Sphere : rayon sphère ~valeur rayon~
    public void afficher() {
        super.afficher();
        System.out.println("Cercle : rayon " + this.getRayon());
        System.out.println("Sphere : rayon sphere " + this.getRayon());
    }
 }
