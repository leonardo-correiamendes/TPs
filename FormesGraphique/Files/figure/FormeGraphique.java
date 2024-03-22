/**
 * Classe representant des FormesGraphique
 */
public class FormeGraphique {

	// Attributs
	private int origine_x ;
	private int origine_y ;
	
	/**
	 * Constructeur non parametre
	 */
	public FormeGraphique() {
		this.origine_x = 0 ;
		this.origine_y = 0 ;
	}

	/**
	 * Constructeur parametre
	 * @param pfX IN : Abscisse X de la forme graphique
	 * @param pfY IN : Abscisse Y de la forme graphique
	 */
	public FormeGraphique(int pfX, int pfY) {
		this.origine_x = pfX ;
		this.origine_y = pfY ;
	}

	/**
	 * Retourne l'abscisse X de la forme graphique
	 * 
	 * @return l'abscisse de la forme graphique
	 */
	public int getOrigineX() {
		return this.origine_x ;
	}

	/**
	 * Retourne l'ordonnee Y de la forme graphique
	 * 
	 * @return l'ordonnee Y de la forme graphique
	 */
	public int getOrigineY() {
		return this.origine_y ;
	}

	/**
	 * Permet de modifier l'abscisse X de la forme graphique
	 * 
	 * @param pfX IN : nouvelle abscisse X de la forme graphique
	 */ 
	public void setOrigineX(int pfX) {
		this.origine_x = pfX ;
	}

	/**
	 * Permet de modifier l'ordonnee Y de la forme graphique
	 * 
	 * @param pfY IN : nouvelle ordonnee Y de la forme graphique
	 */ 
	public void setOrigineY(int pfY) {
		this.origine_y = pfY ;
	}

	/**
	 * Retourne la surface de la forme graphique
	 * 
	 * @return surface de la forme graphique
	 */
	public double surface() { // aussi appel� aire pour les figures planes
		return 0; 
	}

	/**
	 * Retourne le volume de la forme graphique
	 * 
	 * @return volume de la forme graphique
	 */
	public double volume() { 
		return 0; 
	}

	/**
     * Affiche de maniere structuree tous les attributs du carre
     */
	public void afficher() { 
		System.out.println("Forme graphique : abscisse " 
			+ this.origine_x 
			+ " ordonn�e " 
			+ this.origine_y);
	}
}