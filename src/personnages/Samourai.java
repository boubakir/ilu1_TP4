package personnages;



// TP 5 Q3-a
public class Samourai extends Humain {
	private String seigneur;
	
	public Samourai(String seigneur, String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
		this.seigneur = seigneur;
	}

	// TP 5 Q3-a
	@Override
	public void direBonjour() {
		super.direBonjour();
		String message = "Je suis fier de servir le seigneur " + this.seigneur;
		this.parler(message);
	}

	// TP 5 Q3-d
	 public void boire(String boisson) {
		 String message = "Qu'est-ce que je vais choisir comme boisson ?"
		 		+ " Tiens je vais prendre du" + boisson;
		 parler(message);
	 }
	
	
	

}
