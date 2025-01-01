package Transport;

public class Vehicule {

	protected String marque;
	protected int dateAchat;
	protected double prixAchat ,prixCourant;
	
	public Vehicule(String marque, int dateAchat, double prixAchat) {
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
	}
	
	public void affiche() {
		System.out.println("Marque : "+this.marque+" Date Achat : "+this.dateAchat+" 	Prix Achat : "+this.prixAchat);
	}
	public void calculePrix(int anneActuelle) {
		if(anneActuelle>this.dateAchat) {
			int dif= anneActuelle-this.dateAchat;
			double prix=this.prixAchat;
			for(int i=0;i<dif;i++) {
				prix=prix-(this.prixAchat*0.02);
			}
			this.prixCourant=prix;
		}
		else{
			this.prixCourant=this.prixAchat;
		}
	}
}
