package personnages;

public class Humain {
	private String nom;
	private String boissonPreferee;
	private int argent;
	
	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

	public String getBoissonPreferee() {
		return boissonPreferee;
	}

	public int getArgent() {
		return argent;
	}
	
	public String direBonjour() {
		return " Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonPreferee;
	}
	
	public String boire() {
		return " Mmmm, un bon verre de " + boissonPreferee + " ! GLOUPS ! ";
	}
	
	public String acheter(String bien, int prix) {
		if(prix < argent) {
			return " j'ai " + argent + " sous en poche. Je vais pouvoir acheter " + bien + " à " + prix + " sous ";
		}
		else {
			return " Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous";
		}
	}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	
	public void perdreArgent(int perte) {
		argent = argent - perte;
	}
	
	public void parler(String texte) {
		System.out.println(" ( " + nom + " ) - " + texte);
	}
	
}
