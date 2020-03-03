import java.util.ArrayList;

/**
 * @author Jack
 * This class implements Subject and adds
 */
public class Baby implements Subject{
	private ArrayList<Observer> observers;
	private Cry cry;
	
	public Baby() {
		observers = new ArrayList<Observer>();
		System.out.println("A baby is born");
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observers : observers) {
			observers.update(cry);
		}
	}
	
	public void angryCry() {
		System.out.println("This baby is angry!");
		cry = Cry.ANGRY;
		notifyObservers();
	}
	
	public void hungryCry() {
		System.out.println("This baby is hungry");
		cry = Cry.HUNGRY;
		notifyObservers();
	}
	
	public void wetCry() {
		System.out.println("This baby is wet");
		cry = Cry.WET;
		notifyObservers();
	}
}
