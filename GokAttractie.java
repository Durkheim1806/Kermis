
abstract public class GokAttractie extends Attractie implements Belastbaar {
	
	double belasting;
	
	public void kansSpelBelastingBetalen() {
		this.belasting = omzet * 0.30;
		System.out.println("De belasting van " + naam + " is: " + belasting);	
	}
}
