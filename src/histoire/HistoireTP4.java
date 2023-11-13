package histoire;
import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain ben = new Humain("ben", "Coca", 35);
		Commercant patoche = new Commercant("patoche", "White Spirit", 25);
		Yakuza marco = new Yakuza("marco", "Whiskey", 40, "Team Rocket");
		Ronin kendo = new Ronin("kendo", "Water", 30);
		
		ben.direBonjour();
		ben.acheter("Tableau", 25);
		ben.boire();
		ben.acheter("Vase", 5);
		ben.acheter("Coca bien frais", 10);
	
		patoche.direBonjour();
		patoche.seFaireExtorquer();
		patoche.recevoir(2);
		patoche.boire();
		
		marco.direBonjour();
		marco.extorquer(patoche);
		
		kendo.direBonjour();
		kendo.donner(patoche);
		
		kendo.provoquer(marco);
	}
}
