import java.util.ArrayList;

public class Kermis {
	
	ArrayList<Attractie> attracties;
	Kassa kassa1;
	
	Kermis(){
		
		this.attracties = new ArrayList<>();
		attracties.add(new Botsautos());
		attracties.add(new Spin());
		attracties.add(new Spookhuis());
		attracties.add(new Spiegelpaleis());
		attracties.add(new Ladderklimmen());
		attracties.add(new Hawaii());
		
		this.kassa1 = new Kassa();
	
	}
	

}
