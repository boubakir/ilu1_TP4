package personnages;

public class Humain {
	
	protected String nom;
	private String boissonFavorite;
	protected int quantiteArgent;
	// TP 5
	private int nbConnaissance;
	private Humain[] memire = new Humain[3];
	
	
	
	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}
	public void direBonjour() {
		String message = "Bonjour ! Je m’appelle " + this.nom + " et j’aime boire du " + 
				this.boissonFavorite;
		parler(message);
	}
	 public void boire() {
		 String message = "Mmmm, un bon verre de " + this.boissonFavorite + "  ! GLOUPS !";
		 parler(message);
	 }
	 
	 public void acheter(String bien, int prix) {
		 String message = "";
		 if(this.quantiteArgent >= prix) {
			 perdreArgent(prix);
			 message = "J'ai "+this.quantiteArgent + 
					 " sous en poche. Je vais pouvoir m'offrir " +
					 bien + " à " + prix + " sous";
			 
		 }else {
			 message = "Je n'ai plus que" + this.quantiteArgent + 
					 "sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous";
		 }
		 this.parler(message);
		 
	 }
	 
	 public void gagnerArgent(int gain) {
		 this.quantiteArgent += gain;
	 }
	 public void perdreArgent(int perte) {
		 this.quantiteArgent -= perte;
	 }
	


	protected void parler(String message) {
		System.out.println("("+this.nom + ") - "+message);
	}



	public String getNom() {
		return nom;
	}




	public int getQuantiteArgent() {
		return quantiteArgent;
	}

	// TP 5 Q1-a
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		this.memoriser(humain);
		
		
	}
	
	// TP 5 Q1-a
	private void memoriser(Humain humain) {
		if(nbConnaissance < memire.length ) {
			memire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}

	// TP 5 Q1-a
	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
		
	}

	// TP 5 Q1-b
	public void listerConnaissance() {
		StringBuilder message = new StringBuilder("Je connais beaucoup de monde dont: ");
		for(int i = 0; i < this.nbConnaissance; i++) {
			message.append(memire[i].getNom());
			if(i < this.nbConnaissance - 1) message.append(", ");
		}
		this.parler(message.toString());
	}
	

	public static void main(String[] args) {
	

	}

}
