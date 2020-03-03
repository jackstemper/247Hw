public class Dad implements Observer{
	private Subject baby;
	
	public Dad(Subject baby) {
		this.baby = baby;
		baby.registerObserver(this);
	}
	
	public void update(Subject.Cry cry) {
		if(cry == Subject.Cry.ANGRY) {
			System.out.println("Dad puts in earplugs");
		} else if(cry == Subject.Cry.HUNGRY) {
			System.out.println("Dad feeds baby");
		} else if(cry == Subject.Cry.WET) {
			System.out.println("Dad calls mom");
		}
	}
}
