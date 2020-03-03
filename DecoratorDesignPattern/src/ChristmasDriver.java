public class ChristmasDriver {
	
	public void runDriver() {
		ChristmasTree trees[] = new ChristmasTree[3];
		trees[0] = new RealChristmasTree();
		trees[1] = new FakeChristmasTree();
		trees[2] = new CharlieBrownTree();
		
		//decorate real tree
		trees[0] = new Tinsel(trees[0]);
		trees[0] = new Star(trees[0]);
		
		//decorate fake tree
		trees[1] = new Lights(trees[1]);
		trees[1] = new Star(trees[1]);
		
		//decorate twig
		trees[2] = new Star(trees[2]);
		
		System.out.println("******** Christmas Tree Yard *******");
		
		System.out.println("I would like to order, 3 Christmas Trees:");
		
		for(ChristmasTree tree : trees) {
			System.out.println(tree + " Costs: $" + tree.getCost());
		}
	}
	
	public static void main(String[] args) {
		ChristmasDriver cd = new ChristmasDriver();
		cd.runDriver();
	}
}
