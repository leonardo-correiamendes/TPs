
public class HeritageTestFG3D {
	public static void main(String[] args) {
		// Completer les test ici.
		
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
		Cercle cerclUn = new Cercle();
		Cercle cerclDeux = new Cercle(15, 15, 4);

		// b. Lui appliquer la méthode afficher() héritée.
		cerclUn.afficher();
		System.out.println();

		cerclDeux.afficher();
		System.out.println();

		// Lui appliquer les méthodes transformateurs de la classe.
		cerclUn.setRayon(5);
		cerclDeux.setRayon(8);

		// c. Lui appliquer les méthodes transformateurs héritées.
		cerclUn.setOrigineX(7);
		cerclUn.setOrigineY(7);

		cerclDeux.setOrigineX(25);
		cerclDeux.setOrigineY(25);

		// Lui appliquer la méthode afficher().
		cerclUn.afficher();
		cerclDeux.afficher();

		// Lui appliquer les méthodes accesseurs de la classe (dans un System.out.println())
		System.out.println("Cercle Un : rayon " + cerclUn.getRayon() + "\n");
		System.out.println("Cercle Deux : rayon " + cerclDeux.getRayon() + "\n");

		// d. Lui appliquer les méthodes accesseurs héritées (dans un System.out.println()).
		System.out.println("Cercle Un : abscisse " + cerclUn.getOrigineX() + " ordonnee " + cerclUn.getOrigineY() + "\n");

		System.out.println("Cercle Duex : abscisse " + cerclDeux.getOrigineX() + " ordonnee " + cerclDeux.getOrigineY() + "\n");

		// Test Cylindre

		// Créer un objet avec chaque constructeur défini dans la classe (x constructeurs ⇒ x création d’objets différentes).
		Cylindre cylUn = new Cylindre();
		Cylindre cylDeux = new Cylindre(40, 40, 10, 3);

		// Pour chaque objet créé :
		// appliquer la méthode afficher().
		cylUn.afficher();
		System.out.println();

		cylDeux.afficher();
		System.out.println();

		// Lui appliquer les méthodes transformateurs de la classe.
		cylUn.setRayon(1);
		cylDeux.setRayon(9);

		cylUn.setHauteur(2);
		cylDeux.setHauteur(7);

		// Lui appliquer les méthodes transformateurs héritées.
		cylUn.setOrigineX(60);
		cylDeux.setOrigineX(80);

		cylUn.setOrigineY(60);
		cylDeux.setOrigineY(80);

		// Lui appliquer la méthode afficher().
		cylUn.afficher();
		System.out.println();

		cylDeux.afficher();
		System.out.println();

		// Lui appliquer les méthodes accesseurs de la classe (dans un System.out.println()).
		System.out.println("Cylindre Un : rayon " + cylUn.getRayon() + "\n");
		System.out.println("Cylindre Un : hauteur " + cylUn.getHauteur() + "\n");
		
		System.out.println("Cylindre Deux : rayon " + cylDeux.getRayon() + "\n");
		System.out.println("Cylindre Deux : hauteur " + cylDeux.getHauteur() + "\n");

		// Lui appliquer les méthodes accesseurs héritées (dans un System.out.println()).
		System.out.println("Cylindre Un : abscisse " + cylUn.getOrigineX() + " ordonnee " + cylUn.getOrigineY() + "\n");

		System.out.println("Cylindre Deux : abscisse " + cylDeux.getOrigineX() + " ordonnee " + cylDeux.getOrigineY() + "\n");


		// Test Sphere

		// Créer un objet avec chaque constructeur défini dans la classe (x constructeurs ⇒ x création d’objets différentes).
		Sphere sphUn = new Sphere();
		Sphere sphDeux = new Sphere(50, 50, 20);

		// appliquer la méthode afficher().
		sphUn.afficher();
		System.out.println();

		sphDeux.afficher();
		System.out.println();

		// Lui appliquer les méthodes transformateurs de la classe.
		sphUn.setRayon(5);
		sphDeux.setRayon(40);

		// Lui appliquer les méthodes transformateurs héritées.
		sphUn.setOrigineX(100);
		cylDeux.setOrigineX(150);

		cylUn.setOrigineY(100);
		cylDeux.setOrigineY(150);

		// Lui appliquer la méthode afficher().
		sphUn.afficher();
		System.out.println();

		sphDeux.afficher();
		System.out.println();

		// Lui appliquer les méthodes accesseurs de la classe (dans un System.out.println()).
		System.out.println("Sphere Un : rayon " + sphUn.getRayon() + "\n");
		
		System.out.println("Sphere Deux : rayon " + sphDeux.getRayon() + "\n");


		// Test Carre

		System.out.println("Test Carre \n");

		Carre carreUn = new Carre();
		Carre carreDeux = new Carre(20, 20, 6);

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

		// 5.1) Pour en arriver au polymorphisme
		// 1. Vous devriez avoir créé 12 objets (12 new, 2 par classe).
		// Oui

		// 2. Insérer la déclaration suivante pour créer un tableau de 12 éléments de type FormeGraphique et y ranger les formes graphiques créées :
		FormeGraphique tabFormes[];

		tabFormes = new FormeGraphique [12];

		tabFormes[0] = fgUn; // variable référençant la première FormeGraphique créée
		tabFormes[1] = fgDeux; // variable référençant la deuxième FormeGraphique créée
		tabFormes[2] = rectUn; // variable référençant le premier Rectangle créé
		tabFormes[3] = rectDeux; // variable référençant le deuxième Rectangle créé
		tabFormes[4] = carreUn; // variable référençant le premier Carré créé
		tabFormes[5] = carreDeux; // variable référençant le deuxieme Carré créé
		tabFormes[6] = cerclUn; // variable référençant le premier Cercle créé
		tabFormes[7] = cerclDeux; // variable référençant le deuxieme Cercle créé
		tabFormes[8] = cylUn; // variable référençant le premier Cylindre créé
		tabFormes[9] = cylDeux; // variable référençant le deuxieme Cylindre créé
		tabFormes[10] = sphUn; // variable référençant la premiere Sphere créé
		tabFormes[11] = sphDeux; // variable référençant la deuxieme Sphere créé

		// 4. Compiler. OK ?
		// Oui

		// 5. Faire une boucle pour afficher l’indice courant (i), et appliquer surface(), volume() et appliquer afficher() à chaque élément du tableau.
		for (int i = 0; i < tabFormes.length; i++) {

			// Affichage indice
			System.out.println("Indice : " + i);

			// Surface et volume
			System.out.println("Surface de la figure : " + tabFormes[i].surface());
			System.out.println("Volume de la figure : " + tabFormes[i].volume());
			
			// Afficher
			tabFormes[i].afficher();

			// 8. 
			System.out.println("HashCode de la figure : " + System.identityHashCode(tabFormes[i]));
			System.out.println("Classe de la figure : " + tabFormes[i].getClass());
		}

		// Compiler. ok ?
		// Oui

		// 7. Quel est le résultat obtenu à l’exécution ? Quelles méthodes sont réellement appelées (classe de définition de la méthode appelée) ?
		// On obtient le meme resultat que precedamment 
		// Les methodes utilisees sont celles de FormeGraphique

		// 8. Ajouter dans la boucle l’instruction suivante :
		// System.out.println(System.identityHashCode(tabFormes[i]));
		// System.out.println(tabFormes[i].getClass());

		// 9. Quel est le résultat ?
		// Le hash code de l'objet ainsi que sa classe

		// A Noter : nous n’avions jusqu’à aujourd’hui jamais mis d’objets de nature différente dans un même tableau…​ Qu’ont en commun tous les objets pour que l’on puisse les ranger dans le tableau tabFormes ?
		// Ils heritent tous de la class FormeGraphique

		
	}
}
