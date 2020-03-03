/**
 * @author Jack
 * This class is the grocerystore
 * it makes a cereal based on an order and then makes, boxes, and prices it
 */
public class GroceryStore {
	public Cereal orderCereal(String type) {
		Cereal cereal;
		if(type.equals("frosted flakes")) {
			cereal = new FrostedFlakes();
		} else if(type.equals("lucky charms")) {
			cereal = new LuckyCharms();
		} else if(type.equals("fruit loops")) {
			cereal = new FruitLoops();
		} else {
			cereal = new LuckyCharms();
		}
		cereal.prepare();
		cereal.boxCereal();
		cereal.priceCereal();
		return cereal;
	}
}
