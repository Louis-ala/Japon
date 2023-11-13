package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance = 0;
	private Humain[] connaissances = new Humain[30];
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}
	
	public void boire() {
		parler(
				"Mmm, un bon verre de " + this.boisson + "! GLOUPS!");
	}
	
	public void acheter(String bien, int prix) {
		if( this.argent >= prix) {
			parler("J'ai " + this.argent + " sous en poche! " + " . Je vais pouvoir m'offrir un(e) " + bien + " à " + prix + " sous. ");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux meme pas m'offrir un(e) " + bien + " à " + prix + " sous. ");
		}
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perdreArgent(int gain) {
		this.argent -= gain;
	}
	
	public void repondre(Humain autreHumain) {
		this.direBonjour();
		this.memoriser(autreHumain);
	}
	
	public Humain memoriser(Humain humainMemoriser) {
		if(this.nbConnaissance == 30) {
			for(int i = 0; i < ((this.nbConnaissance) - 1); i++) {
				this.connaissances[i] = this.connaissances[i+1];
			}
		}
		if(this.nbConnaissance < 30) {
			this.connaissances[this.nbConnaissance - 1] = humainMemoriser;
			this.nbConnaissance += 1;
		}
		else {
			this.connaissances[this.nbConnaissance - 1] = humainMemoriser;
		}
		return humainMemoriser;
	}
	
	protected void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		System.out.println(" Je connais beaucoup de monde dont : ");
		for(int i = 0; i < this.nbConnaissance; i++) {
			System.out.println(" , " + this.connaissances[i]);
		}
	}
}