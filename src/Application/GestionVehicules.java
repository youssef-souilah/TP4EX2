package Application;

import Transport.Avion;
import Transport.Voiture;

class GestionVehicules {
	private static int ANNEE_ACTUELLE = 2020;
	public static void main(String[] args) {
		Voiture[] garage = new Voiture[3];
		Avion[] hangar = new Avion[2];
		garage[0] = new Voiture("Peugeot", 2010, 147325.79, 2.5, 5, 180.0, 12000);
		garage[1] = new Voiture("Porsche", 2000, 250000.00, 6.5, 2, 280.0, 81320);
		garage[2] = new Voiture("Fiat", 2011, 7327.30, 1.6, 3, 65.0, 3000);
		hangar[0] = new Avion("AV123", 1998, 1730673.90, "HELICES", 1250);
		hangar[1] = new Avion("CR123", 1999, 4521098.00, "REACTION", 1500);
		for (int i = 0; i < garage.length; i++) {
			garage[i].calculePrix(ANNEE_ACTUELLE);
			garage[i].affiche(); 
		}
		for (int i = 0; i < hangar.length; i++) {
			hangar[i].calculePrix(ANNEE_ACTUELLE);
			hangar[i].affiche(); 
		}
	}
}
