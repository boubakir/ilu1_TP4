package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		
		// 1 c
		System.out.println("Scénario 1 :");
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);  
		prof.acheter("un kimono", 50);
		
		// 2.1 b
		System.out.println();
		System.out.println("Scénario 2 : Tester commercant");
		Commercant macro = new Commercant("Marco", 54);
		macro.direBonjour();
		macro.seFaireExtorquer();
		macro.rcevoir(15);
		macro.boire();
		
		
		// 2.2 b
		System.out.println();
		System.out.println("Scénario 3 : Tester Yakuza");
		
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(macro);
		
		// 2.3 b
				System.out.println();
				System.out.println("Scénario 3 : Tester Ronin");
				
				Ronin roro = new Ronin("Roro", "shochu", 60);
				roro.direBonjour();
				roro.donner(macro);
		
				
				
		// 2.3 b
		System.out.println();
		System.out.println("Scénario 3 : Tester duel");
		roro.provoquer(yakuLeNoir);

	}

}
