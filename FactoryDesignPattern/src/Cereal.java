/**
 * @author Jack
 * This class is Cereal and it has a price and name
 * it also has a prepare method that outputs something,
 * a boxCereal method that outputs its being boxed,
 * and a price method that outputs the price
 */
public abstract class Cereal {
	protected String name;
	protected Double price;
	
	public void prepare() {
		System.out.println("Preparing the " + this.name);
	}
	
	public void boxCereal() {
		System.out.println("Putting fun pictures of " + this.name + " on a box");
		System.out.println("Pouring the " + this.name + " into the box");
	}
	
	public void priceCereal() {
		System.out.println("Putting a price tags of $" + this.price + " on the " + this.name + " box");
	}
}
