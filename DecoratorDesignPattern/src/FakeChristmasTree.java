/**
 * @author Jack
 * This class extends Christmas tree and gives it a price and description
 */
public class FakeChristmasTree extends ChristmasTree{
	private double FAKE = 50.0;
	public FakeChristmasTree() {
		this.description = "Artifical Christmas Tree";
	}
	public double getCost() {
		return FAKE;
	}
}
