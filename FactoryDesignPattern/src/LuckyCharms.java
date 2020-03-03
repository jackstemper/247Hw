/**
 * @author Jack
 * This class extends Cereal and gives it a price and name
 * it also does the prepare method by using the super version in Cereal then outputting LuckyCharms related prepsteps
 */
public class LuckyCharms extends Cereal{
	private double CHARMS = 1.55;
	public LuckyCharms() {
		name = "Lucky Charms";
		price = CHARMS;
	}
	public void prepare() {
		super.prepare();
		System.out.println("    - Gather the grain");
		System.out.println("    - Shape into circles");
		System.out.println("    - Create marshmellow shapes");
		System.out.println("    - Mix circles and marshmellows");
	}
}