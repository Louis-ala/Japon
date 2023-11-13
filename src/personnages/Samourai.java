package personnages;

public class Samourai extends Ronin {
	String seigneur;

	public Samourai(String seigneur, String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur " + this.getSeigneur() + ".");
	}
	
	public void boire(String boisson) {
		super.boire();
		this.parler(" Qu'est-ce que je vais choisir comme boisson? Tiens je vais prendre du " + boisson + " . ");
	}
}
