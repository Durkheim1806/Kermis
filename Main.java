
public class Main {

	public static void main(String[] args) {
		
		Kermis kermis1 = new Kermis();
			
		for(int i = 0; i < 6; i++) {
			kermis1.attracties.get(1).draaien();
		}
		
		for(int i = 0; i < 11; i++) {
			kermis1.attracties.get(5).draaien();
		}
		
		kermis1.attracties.get(0).kaartjesVerkopen(3);
		kermis1.attracties.get(4).kaartjesVerkopen(3);
		kermis1.kassa1.omzetBerekenen(kermis1.attracties);
		kermis1.attracties.get(4).kansSpelBelastingBetalen();
		kermis1.attracties.get(0).kansSpelBelastingBetalen();
	}

	
}
