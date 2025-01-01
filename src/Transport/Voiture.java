package Transport;

public class Voiture extends Vehicule {

	protected double cylindree,puissance,kilometrage;
	protected int nbPortes;
	
	public Voiture(String marque, int dateAchat, double prixAchat,double cylindree,double puissance,double kilometrage,int nbPortes) {
		super(marque, dateAchat, prixAchat);
		this.cylindree=cylindree;
		this.puissance=puissance;
		this.kilometrage=kilometrage;
		this.nbPortes=nbPortes;
	}
	
	@Override
	public void affiche() {
		super.affiche();
		System.out.println("Cylindree : "+this.cylindree+" Puissance : "+this.puissance+" Kilometrage : "+this.kilometrage+" Nomber Portes : "+this.nbPortes);
	}
	@Override
	public void calculePrix(int anneActuelle) {
		double valeur=0;
		if(anneActuelle>this.dateAchat) {
			int dif= anneActuelle-this.dateAchat;
			double prix=this.prixAchat;
			for(int i=0;i<dif;i++) {
				valeur=valeur+(this.prixAchat*0.02);
			}
		}
		else{
			this.prixCourant=this.prixAchat;
		}
		
		if(this.marque=="Renault"||this.marque=="Fiat") {
			int tranches=(int) (this.kilometrage/10000);
			valeur=valeur+(this.prixAchat*0.05)*tranches;
		}
		else if (this.marque=="Ferrari"||this.marque=="Porsche") {
			int tranches=(int) (this.kilometrage/10000);
			valeur=valeur+(this.prixAchat*0.1)*tranches;
		}
		else {
			int tranches=(int) (this.kilometrage/10000);
			valeur=valeur+(this.prixAchat*0.06)*tranches;
		}
		if(this.prixAchat-valeur>0) {
			this.prixCourant=this.prixAchat-valeur;
		}
		else {
			this.prixCourant=0;
		}
	}

}
