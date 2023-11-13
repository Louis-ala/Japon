package personnages;

public class Yakuza extends Humain {
	String clan;
	int reputation;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		int argent = victime.getArgent();
		
		parler("Tiens, tiens, ne serait-ce pas un faible voyageur, passe ton argent je dois appeler ma mère. ");
		
		super.gagnerArgent(victime.seFaireExtorquer());
		parler("J'ai chourav les " + argent + " sous de " + victime.getNom() + ", ce qui me fait " + super.getArgent() + " sous dans ma poche! ");
		
		this.reputation++;
	}
	
	public int perdre() {
		int argent = super.getArgent();
		
		super.perdreArgent(argent);
		this.reputation--;
		parler("J'ai perdu, j'suis trop nul ");
		
		return argent;
	}
	
	public int gagner(int gain) {
		super.gagnerArgent(gain);
		this.reputation++;
		parler("J'ai gagné! J'suis trop le boss! ");
		
		return gain;
	}
}