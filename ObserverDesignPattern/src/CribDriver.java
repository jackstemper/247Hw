
public class CribDriver {
	
	public void playBabySim() {
		Baby baby = new Baby();
		Dad dad = new Dad(baby);
		Mom mom = new Mom(baby);
		
		baby.hungryCry();
		baby.wetCry();
		baby.angryCry();
		baby.hungryCry();
		baby.wetCry();
	}
	
	public static void main(String[] args) {
		CribDriver cd = new CribDriver();
		cd.playBabySim();
	}

}
