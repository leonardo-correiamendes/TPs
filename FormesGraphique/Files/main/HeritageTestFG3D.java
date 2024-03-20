
public class HeritageTestFG3D {
	public static void main(String[] args) {
		// Compl�ter les test ici.
		
		// Exemple de test FormeGraphique
		
		FormeGraphique fgUn;
		FormeGraphique fgDeux;
		
		fgUn = new FormeGraphique();
		System.out.println("Test FormeGraphique 1");
		fgUn.afficher();
		fgUn.setOrigineX(550);
		fgUn.setOrigineY(660);
		fgUn.afficher();
		System.out.println("X : " + fgUn.getOrigineX());
		System.out.println("Y : " + fgUn.getOrigineY());
		System.out.println("Surface : " + fgUn.surface());
		System.out.println("Volume : " + fgUn.volume());
				
		fgDeux = new FormeGraphique(100, 200);		
		System.out.println("Test FormeGraphique 2");
		fgDeux.afficher();
		fgDeux.setOrigineX(550);
		fgDeux.setOrigineY(660);
		fgDeux.afficher();
		System.out.println("X : " + fgDeux.getOrigineX());
		System.out.println("Y : " + fgDeux.getOrigineY());
		System.out.println("Surface : " + fgDeux.surface());
		System.out.println("Volume : " + fgDeux.volume());

		System.out.println();

		// 15. Écrire un petit test de la classe dans la méthode main() déjà proposée.

		// Créer un objet avec chaque constructeur défini dans la classe (x constructeurs ⇒ x création d’objets différentes).
		Rectangle rectUn = new Rectangle();
		Rectangle rectDeux = new Rectangle(2, 2, 4, 4);

		// Pour chaque objet créé :
		// Lui appliquer la méthode afficher().
		rectUn.afficher();
		System.out.println();

		rectDeux.afficher();
		System.out.println();

		// Lui appliquer les méthodes transformateurs de la classe.
		rectUn.setLargeur(3);
		rectUn.setLongueur(3);

		rectDeux.setLargeur(5);
		rectDeux.setLongueur(5);

		// Lui appliquer les méthodes transformateurs héritées.
		rectUn.setOrigineX(10);
		rectUn.setOrigineY(10);

		rectDeux.setOrigineX(5);
		rectDeux.setOrigineY(10);

		// Lui appliquer la méthode afficher().
		rectUn.afficher();
		System.out.println();

		rectDeux.afficher();
		System.out.println();

		// Lui appliquer les méthodes accesseurs de la classe (dans un System.out.println()).
		System.out.println("Rectangle Un : abscisse " + rectUn.getOrigineX() + " ordonnee " + rectUn.getOrigineY() + 
		" largeur " + rectUn.getLargeur() + " longueur " + rectUn.getLongueur() + "\n");

		System.out.println("Rectangle Deux : abscisse " + rectDeux.getOrigineX() + " ordonnee " + rectDeux.getOrigineY() + 
		" largeur " + rectDeux.getLargeur() + " longueur " + rectDeux.getLongueur() + "\n");

		// 16. Vérifier les valeurs affichées à l’écran ! Elles doivent être correctes.
		// Tout est OK

		// 4.1) 2. Écrire un petit test de la classe dans la méthode main() :

		// a. Créer un objet avec un constructeur Cercle par défaut (sans paramètres).
		Cercle cerlcUn = new Cercle();

		// b. Lui appliquer la méthode afficher() héritée.
		cerlcUn.afficher();
		System.out.println();

		// c. Lui appliquer les méthodes transformateurs héritées.
		cerlcUn.setOrigineX(7);
		cerlcUn.setOrigineY(7);

		// d. Lui appliquer les méthodes accesseurs héritées (dans un System.out.println()).
		System.out.println("Cercle Un : abscisse " + cerlcUn.getOrigineX() + " ordonnee " + cerlcUn.getOrigineY() + "\n");

		// Test Carre
		System.out.println("Test Carre \n");

		Carre carreTrois;
		carreTrois = new Carre (1, 1, 10);
		carreTrois.afficher();
		System.out.println();

		System.out.println("Surface : " + carreTrois.surface()); // Surface :100.0
		System.out.println();

		carreTrois.setHauteur(20);
		carreTrois.afficher();
		System.out.println();

		System.out.println("Surface : " + carreTrois.surface()); // Surface : 400.0
		System.out.println();

		carreTrois.setLongueur(30);
		carreTrois.afficher();
		System.out.println();

		System.out.println("Surface : " + carreTrois.surface()); // Surface : 900.0
		System.out.println();
	}
}
