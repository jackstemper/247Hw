public class Mom implements Observer{
	private Subject baby;
	
	public Mom(Subject baby) {
		this.baby = baby;
		baby.registerObserver(this);
	}
	
	public void update(Subject.Cry cry) {
		if(cry == Subject.Cry.ANGRY) {
			System.out.println("Mom hugs and rocks baby, maybe spoiling");
		} else if(cry == Subject.Cry.HUNGRY) {
			System.out.println("Mom cuddles and feeds baby");
		} else if(cry == Subject.Cry.WET) {
			System.out.println("Mom changes baby");
		}
	}
}
