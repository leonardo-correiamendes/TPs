package test;

import lesschtroumpfs.Schtroumpf;

public class MainSchtroumpf {

	public static void main (String[] argv) {
		
		// Creer le Schtroumpf grognon
		Schtroumpf grognon = new Schtroumpf("grognon", 125);
		
		// Puis grognon se présente à nous et chante
		grognon.sePresenter();
		grognon.chanter();
		
		// Puis grognon part travailler
		grognon.allerTravailler();
		
		// Puis grognon se présente à nous et chante
		grognon.sePresenter();
		grognon.chanter();
		
		// Puis grognon mange 10 salsepareille
		grognon.manger(10);
		
		// Puis grognon se présente à nous et chante
		grognon.sePresenter();
		grognon.chanter();
		
		// Puis grognon fête son anniversaire
		grognon.anniversaire();
		
		// Et enfin grognon se présente à nous et chante une dernière fois
		grognon.sePresenter();
		grognon.chanter();
	}

}
