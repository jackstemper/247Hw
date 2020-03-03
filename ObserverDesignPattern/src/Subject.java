
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
	public enum Cry{ANGRY,HUNGRY,WET};
}
