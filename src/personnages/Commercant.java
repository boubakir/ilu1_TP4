package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
	}
	
	public int seFaireExtorquer() {
		int res = quantiteArgent;
		quantiteArgent = 0; 
		parler("J’ai tout perdu! Le monde est vraiment trop injuste");
		return res;
	}
	
	public void rcevoir(int argent) {
		this.quantiteArgent += argent;
		String message = argent+" sous ! Je te remercie généreux donateur!";
		this.parler(message);
	}

}
