
public class Spin extends RisicoRijkeAttracties{

	Spin(){
		this.naam = "Spin"; 
		this.prijs = 2.25;
	}
	
	void draaien() {
		System.out.println("de attractie " + naam + " draait");
		keuringsteller++;
		opstellingsKeuring();
	}
	
	boolean opstellingsKeuring() {
		boolean keuring;

		if (keuringsteller == 5) {
			keuring = true;
			keuringsteller = 0;
			System.out.println("Er moet gekeurd worden.");
		} else
			keuring = false;

		return keuring;
	}
}
