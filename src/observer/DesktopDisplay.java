package observer;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class DesktopDisplay implements IObserver {
    private  WeatherStation weatherStation;

    public DesktopDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Desktop Display: \n"
                +"Current Temperature is: "+weatherStation.getTemperature()+" 'C"
        );
    }
}
