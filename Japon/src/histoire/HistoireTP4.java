package histoire;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof  = new Humain("Prof", "Kombucha", 54);
		prof.parler(prof.direBonjour());
		prof.parler(prof.acheter("une boisson", 12));
		prof.perdreArgent(12);
		prof.parler(prof.boire());
		prof.parler(prof.acheter("un jeu", 2));
		prof.perdreArgent(2);
		prof.parler(prof.acheter("un kimono", 50));
	}

}
