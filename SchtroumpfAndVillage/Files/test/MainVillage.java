package test;

import lesschtroumpfs.Schtroumpf;
import lesschtroumpfs.Village;

public class MainVillage {

	public static void main (String[] argv) {
		
		// Schtroumpfs
		String[] nomsSchtroumpfs = {
				"Grand Schtroumpf",
				"Schtroumpf courant (et pas ordinaire)",
				"Schtroumpf ordinaire (et pas courant)",
				"Schtroumpf moralisateur à lunettes",
				"Schtroumpf boudeur",
				"Schtroumpf volant",
				"Schtroumpf etonne",
				"Schtroumpf acrobate",
				"Schtroumpf paresseux"
		};
		
		// Stock de salsepareille par defaut
		int stockSalsepareilleFreljord = (int)(Math.random()*100);
		
		// Creer un Village avec les Schtroumpfs
		Village villageFreljord = new Village("Freljord", stockSalsepareilleFreljord, nomsSchtroumpfs);
		
		// Afficher le nom du village, le nombre de Schtroumpfs et le stock de salsepareille
		System.out.println("Presentation du village : \n");
		System.out.println("Non du village : " + villageFreljord.getNom());
		System.out.println("Nombre de Schtroumpfs fesant partie du village : " + villageFreljord.getNbSchtroumpfs());
		System.out.println("Stock de salsepareille du village : " + villageFreljord.getStockSalsepareille());
		System.out.println("\n");
		
		// Lancer les festivites solstice_d_ete().
		System.out.println("C'est la fete !! \n");
		villageFreljord.solstice_d_ete();
		System.out.println("\n");
		
		// Trouver le chef du Village et le faire se présenter
		Schtroumpf chefFreljord = villageFreljord.chefDuVillage();
		System.out.println("Chef du village : ");
		chefFreljord.sePresenter();
		chefFreljord.chanter();
		System.out.println("\n");
		
		// Envoyer des Schtroumpfs au travail
		System.out.println("Les Schtroumpfs vont travailler... \n");
		villageFreljord.envoyerAuTravail();
		
		// Afficher les Schtroumpfs heureux
		System.out.println("Les Schtroumpfs heureux : ");
		villageFreljord.schtroumpfsHeureux();
		System.out.println("\n");
		
		// 5.2 2.

		// 1.
		// Faire ramasser de la salsepareille par les Schtroumpfs
		System.out.println("Les Schtroumpfs vont recolter de la salepareille... \n ");
		villageFreljord.envoyerCueillirSalsepareille();
		System.out.println("C'est la fete !! \n");
		villageFreljord.solstice_d_ete();
		System.out.println("\n");


		// 2.
		// Puis les faire diner tous ensemble
		System.out.println("Les Schtroumpfs vont diner tous ensemble... \n");
		villageFreljord.dinerTousEnsemble();
		System.out.println("C'est la fete !! \n");
		villageFreljord.solstice_d_ete();
	}

}
