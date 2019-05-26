import java.util.ArrayList;

public class Kassa {

	double totaleOmzet;
	
	void omzetBerekenen(ArrayList<Attractie> listattracties) {
		
		for(int i = 0; i < listattracties.size(); i++) {
		totaleOmzet += listattracties.get(i).omzet;
		}
		
		System.out.println("De totale omzet is: " + totaleOmzet);

	}
	
	
}
