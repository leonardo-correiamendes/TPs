
//4.1) 1. La classe Cercle comme héritant de FormeGraphique. C’est tout
//soit simplement : public class Cercle extends FormeGraphique { }
/**
* Classe representant un Cercle
*/
public class Cercle extends FormeGraphique {
 
 // 2. Écrire un petit test de la classe dans la méthode main() :
 // Fait dans HeritageTestFG3D.java

 // 4.3.1) 2. le(s) attribut(s) nécessaire(s),
 // La classe Cercle est une forme graphique comprenant les coordonnées du centre avec en plus un rayon (double).
 private double rayon;

 // 3. un constructeur par défaut initialisant les coordonnées du centre à 0 ainsi que le rayon à 0
 /**
  * Constructeur non parametre
  */
 public Cercle() {
     super();
     this.rayon = 0;
 }

 // 4. un constructeur paramétré permettant d’initialiser correctement toutes les données d’un Cercle
 /**
  * Constructeur parametre 
  * 
  * @param pfCentreX IN : centre en X du cercle
  * @param pfCentreY IN : centre en Y du cercle 
  * @param pfRayon IN : rayon du cercle
  */
 public Cercle(int pfCentreX, int pfCentreY, double pfRayon) {
     super(pfCentreX, pfCentreY);
     this.rayon = pfRayon;
 }

 // 5. une méthode accesseur (get) pour chaque attribut défini
 /**
  * Retourne le rayon du cercle
  * 
  * @return le rayon du cercle
  */
 public double getRayon() {
     return this.rayon;
 }

 // 6. une méthode transformateur (set) pour chaque attribut défini
 /**
  * Permet de mofifier le rayon du cercle
  * 
  * @param pfRayon IN : nouveau rayon du cercle
  */
 public void setRayon(double pfRayon) {
     this.rayon = pfRayon;
 }

 // 7. redéfinir la méthode surface() de calcul de la surface d’un Cercle (rappel : Π x R2) 
 // (utiliser la constante Π de la classe Math : Math.PI)
 public double surface() {
     return (Math.PI * (Math.pow(this.rayon, this.rayon)));
 }

 // 8. redéfinir la méthode afficher() permettant d’afficher à l’écran le texte suivant. On appellera obligatoirement la méthode 
 // afficher() de la classe parente.
 // Texte a afficher : Forme graphique : abscisse ~valeur abcisse~ ordonnée ~valeur ordonnée~
 //                    Cercle : rayon ~valeur rayon~
 public void afficher() {
     super.afficher();
     System.out.println("Cercle : rayon " + this.getRayon());
 }

}
