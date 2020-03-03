public class GroceryStoreDriver {

	public void runStore() {
		GroceryStore groceryStore = new GroceryStore();
		
		Cereal breakfast1 = groceryStore.orderCereal("frosted flakes");
		
		System.out.println("\n-----------------------------------\n");
		
		Cereal breakfast2 = groceryStore.orderCereal("fruit loops");
		
		System.out.println("\n-----------------------------------\n");
		
		Cereal breakfast3 = groceryStore.orderCereal("lucky charms");
	}
	
	public static void main(String[] args) {
		GroceryStoreDriver gsDriver = new GroceryStoreDriver();
		gsDriver.runStore();
	}
}
