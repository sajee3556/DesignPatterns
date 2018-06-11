package observer;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public interface IObservable {
    public void addObservers(IObserver iObserver);
    public void removeObserver(IObserver iObserver);
    public void notifyAllObservers();
}
