package Transport;

public class Vehicule {

	private String marque;
	private int dateAchat;
	private double prixAchat ,prixCourant;

	public Vehicule(String marque, int dateAchat, double prixAchat) {
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
	}
	
	public void affiche() {
		System.out.println("|| Marque : "+this.marque+" Date Achat : "+this.dateAchat+" Prix Achat : "+this.prixAchat+" Prix Courant : "+this.prixCourant+"||");
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
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(int dateAchat) {
		this.dateAchat = dateAchat;
	}

	public double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public double getPrixCourant() {
		return prixCourant;
	}

	public void setPrixCourant(double prixCourant) {
		this.prixCourant = prixCourant;
	}
}
