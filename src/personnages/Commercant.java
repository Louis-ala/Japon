package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public int seFaireExtorquer() {
		int argent = super.getArgent();
		
		super.perdreArgent(super.getArgent());
		super.parler("J'ai tout perdu... Le monde est trop injuste je suis nul...");
		
		return argent;
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler( argent + " sous! Merci beaucoup généreux voyageur! Que les dieux du ciel soient avec toi!");
	}
}