/**
 * @author Jack
 * This class extends Christmas tree and gives it a price and description
 */
public class CharlieBrownTree extends ChristmasTree{
	private double CHARLIE = 5.0;
	public CharlieBrownTree() {
		this.description = "Charlie Brown's Christmas Tree";
	}
	public double getCost() {
		return CHARLIE;
	}
}
