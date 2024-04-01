package personnages;


public class Ronin extends Humain {
	private int honneur = 1;
	
	
	
	public Ronin(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
	}



	public void donner(Commercant beneficiaire){
		int sommeADonner = this.quantiteArgent / 10;
		this.quantiteArgent -= sommeADonner;
		String message = beneficiaire.getNom()+ " prend ces " + sommeADonner + " sous";
		this.parler(message);
		beneficiaire.rcevoir(sommeADonner);
	}
	
	
	// 3 a
	
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur;
		
		if(force >= adversaire.getReputation()) {
			this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce "
					+ "pauvre marchand!");
			this.parler("Je t’ai eu petit yakusa!");
			this.quantiteArgent += adversaire.perd();
			this.honneur ++;
			
		}else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(this.quantiteArgent);
			this.quantiteArgent = 0;
			this.honneur --;
			
		}
		
		
	}
	
	
}
