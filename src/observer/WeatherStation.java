package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class WeatherStation implements IObservable {
    private List<IObserver> observerList = new ArrayList<>();
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    @Override
    public void addObservers(IObserver iObserver) {
        observerList.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        observerList.remove(iObserver);
    }

    @Override
    public void notifyAllObservers() {
        observerList.forEach(iObserver -> {
            iObserver.update();
        });
    }
}
