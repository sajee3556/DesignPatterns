package observer;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class PhoneDisplay implements IObserver {
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Phone Display: \n"
        +"Current Temperature is: "+weatherStation.getTemperature()+" 'C"
        );
    }
}
