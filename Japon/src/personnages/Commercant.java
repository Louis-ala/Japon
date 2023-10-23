package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentPerdu = argent;
		argent = 0;
		this.parler(" Ce monde est vraiment pas cool et injuste dit donc ! "); 
		return argentPerdu;
	}
	
	public void recevoir(int argent) {
		this.argent = this.argent + argent;
		this.parler(" Wahou le ronin t'es vraiment super sympa merci beaucoup !! ");
	}
	
	
}
