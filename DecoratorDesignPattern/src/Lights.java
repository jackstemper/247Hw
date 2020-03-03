/**
 * @author Jack
 * This class extends TreeDecorator and adds to the string and cost when called if its on the tree
 */
public class Lights extends TreeDecorator{
	private ChristmasTree tree;
	private double LIGHTS = 2.0;
	
	public Lights(ChristmasTree tree) {
		this.tree = tree;
	}
	
	public String toString() {
		return tree.toString() + "+ a strings of lights";
	}
	
	public double getCost() {
		return tree.getCost() + LIGHTS;
	}
}
