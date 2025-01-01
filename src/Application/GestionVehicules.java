package Application;

import Transport.Avion;
import Transport.Vehicule;
import Transport.Voiture;

class GestionVehicules {
	private static int ANNEE_ACTUELLE = 2020;
	public static void main(String[] args) {
		Vehicule[] vehicules = new Vehicule[5];
		vehicules[0] = new Voiture("Peugeot", 2010, 147325.79, 2.5, 5, 180.0, 12000);
		vehicules[1] = new Voiture("Porsche", 2000, 250000.00, 6.5, 2, 280.0, 81320);
		vehicules[2] = new Voiture("Fiat", 2011, 7327.30, 1.6, 3, 65.0, 3000);
		vehicules[3] = new Avion("AV123", 1998, 1730673.90, "HELICES", 1250);
		vehicules[4] = new Avion("CR123", 1999, 4521098.00, "REACTION", 1500);
		for (int i = 0; i < vehicules.length; i++) {
			vehicules[i].calculePrix(ANNEE_ACTUELLE);
			vehicules[i].affiche(); 
		}
	}
}
