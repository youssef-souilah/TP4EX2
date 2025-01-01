package Transport;

public class Voiture extends Vehicule {

	protected double cylindree,puissance,kilometrage;
	protected int nbPortes;
	
	public Voiture(String marque, int dateAchat, double prixAchat,double cylindree,int nbPortes,double puissance,double kilometrage) {
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
		if(anneActuelle>this.getDateAchat()) {
			int dif= anneActuelle-this.getDateAchat();
			double prix=this.getPrixAchat();
			for(int i=0;i<dif;i++) {
				valeur=valeur+((this.getPrixAchat()-valeur)*0.02);
			}
		}
		else{
			this.setPrixCourant(this.getPrixAchat());
		}
		
		if(this.getMarque()=="Renault"||this.getMarque()=="Fiat") {
			int tranches=(int) (this.kilometrage/10000);
			valeur=valeur+((this.getPrixAchat()-valeur)*0.05)*tranches;
		}
		else if (this.getMarque()=="Ferrari"||this.getMarque()=="Porsche") {
			int tranches=(int) (this.kilometrage/10000);
			valeur=valeur+((this.getPrixAchat()-valeur)*0.1)*tranches;
		}
		else {
			int tranches=(int) (this.kilometrage/10000);
			valeur=valeur+((this.getPrixAchat()-valeur)*0.06)*tranches;
		}
		if(this.getPrixAchat()-valeur>0) {
			this.setPrixCourant(this.getPrixAchat()-valeur);
		}
		else {
			this.setPrixCourant(0);
		}
	}

}
