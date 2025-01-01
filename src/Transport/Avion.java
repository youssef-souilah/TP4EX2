package Transport;

public class Avion extends Vehicule {

	protected String moteur;
	protected int heuresVol;
	
	public Avion(String marque, int dateAchat, double prixAchat,String moteur,int heuresVol) {
		super(marque, dateAchat, prixAchat);
		this.moteur=moteur;
		this.heuresVol=heuresVol;
	}
	@Override
	public void affiche() {
		super.affiche();
		System.out.println("Moteur : "+this.moteur+" Heures vol : "+this.heuresVol);
	}

	@Override
	public void calculePrix(int anneActuelle) {
		double valeur=0;
		if(this.moteur=="HELICES") {
			int tranches=this.heuresVol/150;
			valeur=(this.getPrixAchat()*0.05)*tranches;
		}
		else {
			int tranches=this.heuresVol/1100;
			valeur=(this.getPrixAchat()*0.05)*tranches;
		}
		if(this.getPrixAchat()-valeur>0) {
			this.setPrixCourant(this.getPrixAchat()-valeur);
		}
		else {
			this.setPrixCourant(0);
		}
	}
}
