/**
 * @author Jack
 * This class extends TreeDecorator and adds to the string and cost when called if its on the tree
 */
public class Star extends TreeDecorator{
	private ChristmasTree tree;
	private double STAR = 6.0;
	
	public Star(ChristmasTree tree) {
		this.tree = tree;
	}
	
	public String toString() {
		return tree.toString() + "+ a star on top";
	}
	
	public double getCost() {
		return tree.getCost() + STAR;
	}
}
