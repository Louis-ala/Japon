package personnages;

public class Ronin extends Humain {
	int honneur;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = super.getArgent() / 10;
		beneficiaire.recevoir(argent);
		super.perdreArgent(argent);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2;
		
		if( force >= adversaire.reputation ) {
			super.gagnerArgent(adversaire.perdre());
			this.honneur++;
			parler("J'ai gagné contre ce Yakuza, je suis beaucoup trop fort! ");
		}
		else {
			if( this.honneur > 0 ) this.honneur--;
			adversaire.gagner(super.getArgent());
			super.perdreArgent(super.getArgent());
			parler("J'ai perdu contre ce Yakuza... Je suis si nul... ");
		}
	}
}