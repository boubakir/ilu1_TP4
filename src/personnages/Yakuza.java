package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation = 0;
	
	
	public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom, boissonFavorite, quantiteArgent);
		this.clan = clan;
	}
	
	
	
	
	// TP 5 Q2-a
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de "+this.clan);
	}




	public int getReputation() {
		return reputation;
	}




	public void extorquer(Commercant victime) {
		
		String message="Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?";	
		this.parler(message);
		message = victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !";
		this.parler(message);
		int sommeExt = victime.seFaireExtorquer();
		this.quantiteArgent += sommeExt;
		
		message = "J’ai piqué les " + sommeExt + " sous de "+ victime.getNom()+
				", ce qui me fait "+this.quantiteArgent+" sous dans ma poche. Hi ! Hi !";
		this.parler(message);	
		
	}
	
	// 3 a

	
	public void gagner(int gain) {
		this.reputation +=1;
		this.quantiteArgent += gain;
		String message = "Ce ronin pensait vraiment battre " + this.nom + " du clan de "+
		this.clan +" Je l'ai dépouillé de ses "+gain+" sous";
		this.parler(message);
	}
	public int perd() {
		int argentPerdu = this.quantiteArgent;
		this.reputation -=1;
		String message = "J’ai perdu mon duel et mes " + this.quantiteArgent+ 
				" sous, snif... J'ai déshonoré le clan de " + this.clan;
		this.parler(message);
		this.quantiteArgent = 0;
		return argentPerdu;
		
	}
	
	
	
	
	
	
	
	
	
	

}
