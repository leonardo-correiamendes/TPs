package lesschtroumpfs;
import java.util.ArrayList;

public class Village {
	private String nomV;
	private ArrayList <Schtroumpf> hab = new ArrayList <Schtroumpf>();
	private int nbSchtroumpfs;
	private int stockSalsepareille;
	
	public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
		this.nomV = pfNomV;
		this.stockSalsepareille = pfStockSalsepareille;
		this.nbSchtroumpfs = 0;
		for (int i = 0; i < pfNomsDesSchtroumpfs.length-1; i++) {
			this.hab.add(new Schtroumpf(pfNomsDesSchtroumpfs[i], (int)(Math.random()*150), this));
			this.nbSchtroumpfs ++;
		}
		
	}
	
	public String getNomV() {
		return this.nomV;
	}
	
	public int getNbSchtroumpf() {
		return this.nbSchtroumpfs;
	}
	
	public int getStockSalsepareille() {
		return this.stockSalsepareille;
	}
	
	public void solstice_d_ete() {
		int nbContent = 0;
		for (int i = 0; i<this.hab.size(); i++) {
			if (this.hab.get(i).estContent()) {
				nbContent ++;
			}
		}
		
		System.out.println("Le nom du village est " + this.getNomV() + ".");
		System.out.println("Le nombre d'habitants est de " + getNbSchtroumpf() + ".");
		System.out.println(nbContent + " est le nombre de villageois content aujourd'hui.");
		
		
		for (int i = 0; i<this.nbSchtroumpfs; i++) {
			this.hab.get(i).sePresenter();
			this.hab.get(i).chanter();
		}
		
	}
	
	public Schtroumpf chefDuVillage() {
		Schtroumpf chef = this.hab.get(0);
		for (int i = 0; i<this.nbSchtroumpfs; i++) {
			if (chef.getAge() < this.hab.get(i).getAge()) {
				chef = this.hab.get(i);
			}
		}
		return chef;
	}
	
	public void ajoutStockSalsepareille(int pfStock) {
		this.stockSalsepareille += pfStock;
	}
	
	public void retraitStockSalsepareille(int pfStock) {
		this.stockSalsepareille -= pfStock;
	}
	
	public void envoyerAuTravail() {
		int schHeureux = 0;
		for (int i = 0; i<this.nbSchtroumpfs; i++) {
			if (this.hab.get(i).estContent()) {
				schHeureux ++;
			}
		}
		schHeureux /= 2;
		for (int i = 0; i<this.nbSchtroumpfs; i++) {
			if (this.hab.get(i).estContent() && schHeureux > 0) {
				this.hab.get(i).allerTravailler();
				schHeureux --;
			}
		}
	}
	
	public void schtroumpsfHeureux() {
		for (int i = 0; i<this.nbSchtroumpfs; i++) {
			if (this.hab.get(i).estContent()) {
				this.hab.get(i).sePresenter();
				this.hab.get(i).chanter();
			}
		}
	}
	
	public void envoyerCueillirSalsepareille() {
		int schHeureux = 0;
		for (int i = 0; i<this.nbSchtroumpfs; i++) {
			if (this.hab.get(i).estContent()) {
				schHeureux ++;
			}
		}
		schHeureux /= 2;
		for (int i = 0; i<this.nbSchtroumpfs; i++) {
			if (this.hab.get(i).estContent() && schHeureux > 0) {
				this.hab.get(i).recolterSalsepareille();
				schHeureux --;
			}
		}
	}
	
	public void dinerTousEnsemble() {
		for (int i = 0; i < this.getNbSchtroumpf(); i++) {
			this.hab.get(i).dinerAuVillage();
		}
	}
}
