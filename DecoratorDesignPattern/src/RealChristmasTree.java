/**
 * @author Jack
 * This class extends Christmas tree and gives it a price and description
 */
public class RealChristmasTree extends ChristmasTree {
	private double REAL = 40.0;
	public RealChristmasTree() {
		this.description = "Real Fir Christmas Tree";
	}
	public double getCost() {
		return REAL;
	}
}
