
public class Hawaii extends RisicoRijkeAttracties{
	
	Hawaii(){
		this.naam = "Hawaii";
		this.prijs = 2.90;
	}

	void draaien() {
		System.out.println("de attractie " + naam + " draait");
		keuringsteller++;
		opstellingsKeuring();
	}
	
	boolean opstellingsKeuring() {
		boolean keuring;

		if (keuringsteller == 10) {
			keuring = true;
			keuringsteller = 0;
			System.out.println("Er moet gekeurd worden.");
		} else
			keuring = false;

		return keuring;
	}
}
