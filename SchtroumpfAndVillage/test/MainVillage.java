package test;

import lesschtroumpfs.Village;

public class MainVillage {

	public static void main (String[] argv) {
		
		String[] nomsSchtroumpfs = {
				"Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur à lunettes",
				"Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf étonné", "Schtroumpf acrobate", "Schtroumpf paresseux"
			};
		
		Village Village1 = new Village ("Village des Stroumpfs", 100, nomsSchtroumpfs);
		
		/* 
		Village1.chefDuVillage().sePresenter();
		Village1.envoyerAuTravail();
	    Village1.schtroumpsfHeureux();
		 */
		
		Village1.envoyerCueillirSalsepareille();
		Village1.solstice_d_ete();
		Village1.dinerTousEnsemble();
		Village1.solstice_d_ete();
	}

}
