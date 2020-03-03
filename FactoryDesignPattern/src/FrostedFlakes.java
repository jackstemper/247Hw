/**
 * @author Jack
 * This class extends Cereal and gives it a price and name
 * it also does the prepare method by using the super version in Cereal then outputting FrostedFlakes related prepsteps
 */
public class FrostedFlakes extends Cereal{
	private double FLAKES = 2.99;
	public FrostedFlakes() {
		name = "Frosted Flakes";
		price = FLAKES;
	}
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain");
		System.out.println("    - Shape into flakes");
		System.out.println("    - Sprinkle with frosting");
	}
}
