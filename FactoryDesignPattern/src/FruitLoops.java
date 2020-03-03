/**
 * @author Jack
 * This class extends Cereal and gives it a price and name
 * it also does the prepare method by using the super version in Cereal then outputting FruitLoops related prepsteps
 */
public class FruitLoops extends Cereal{
	private double LOOPS = 1.89;
	public FruitLoops() {
		name = "Fruit Loops";
		price = LOOPS;
	}
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain");
		System.out.println("    - Shape into circles");
		System.out.println("    - Randomly color circles");
		System.out.println("    - Let circles dry");
	}
}
