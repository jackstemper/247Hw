/**
 * @author Jack
 * This abstract class makes basis for the various tree classes
 */
public abstract class ChristmasTree {
	protected String description;
	protected double price;
	public String toString() {
		return description;
	}
	public abstract double getCost();
}
