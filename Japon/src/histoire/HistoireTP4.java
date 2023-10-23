package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marchand  = new Commercant("Marco", 20);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong");
		marchand.parler(marchand.direBonjour());
		marchand.seFaireExtorquer();
		marchand.recevoir(15);
		marchand.parler(marchand.boire());
		yaku.parler(yaku.direBonjour());
		yaku.parler(" Tiens donc une victime à bolosser viens d'arriver ");
		marchand.seFaireExtorquer();
		yaku.extorquer(marchand);
	}
}
