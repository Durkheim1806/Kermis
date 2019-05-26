
public class Attractie {

	String naam;
	double prijs;
	int oppervlakte;
	double omzet;
	
	void draaien() {
		System.out.println("de attractie " + naam + " draait");
//		System.out.println("de prijs van attractie " + naam + " is " + prijs);
	}
	
	void kaartjesVerkopen(int kaartjes) {
		omzet = kaartjes * prijs;
		System.out.println("De omzet van de kaartjes die zijn verkocht van " + naam + " is: " + omzet);
	}
	
	public void kansSpelBelastingBetalen() {		
	}
	
	
}
