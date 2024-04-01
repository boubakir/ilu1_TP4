package histoire; // +++++

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
	
		// TP 5 Q1-c
		System.out.println(" Partie 1 :");
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);

		// TP 5 Q2-c
		System.out.println(" Partie 2 :");
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		// TP 5 Q3-c
		System.out.println(" Partie 3 :");
		 Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		 akimoto.faireConnaissanceAvec(marco);
		 akimoto.listerConnaissance();
		 
		// TP 5 Q3-e
		 System.out.println(" Partie 3 - e :");
		 akimoto.boire(" thé");
		 
		
	}

}
