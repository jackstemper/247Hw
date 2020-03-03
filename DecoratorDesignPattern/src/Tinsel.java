/**
 * @author Jack
 * This class extends TreeDecorator and adds to the string and cost when called if its on the tree
 */
public class Tinsel extends TreeDecorator{
	private ChristmasTree tree;
	private double TINSEL = 2;
	public Tinsel(ChristmasTree tree) {
		this.tree = tree;
	}
	
	public String toString() {
		return tree.toString() + " + tinsel all around";
	}
	
	public double getCost() {
		return tree.getCost() + TINSEL;
	}
}
