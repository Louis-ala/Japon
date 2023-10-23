package personnages;

public class Yakuza extends Humain{
	public String clan;
	public int reputation = 0;
	
	public Yakuza(String nom, String boissonPreferee, int argent, String clan) {
		super(nom, boissonPreferee, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.argent += victime.argent;
		reputation += 1;
		this.parler(" Je viens de lui péta sa moulaga à l'autre " + victime.nom + " . Maintenant j'ai " + argent + " dans ma bourse. ");
	}
}
