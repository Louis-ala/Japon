package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain ben = new Humain("ben", "coca", 35);
		Commercant marco = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		ben.direBonjour();
		ben.acheter("Tableau", 25);
		ben.boire();
		ben.acheter("Vase", 5);
		ben.acheter("Coca bien frais", 10);
	
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(2);
		marco.boire();
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
	}
}
