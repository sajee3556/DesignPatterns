package observer;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class ObserverDemo {
    public static void main(String[] args) {

        /*
        * First create observable object then
        * create each Observers
        * then add as list
        */
        WeatherStation weatherStationJaffna = new WeatherStation();

        PhoneDisplay pD1 = new PhoneDisplay(weatherStationJaffna);
        weatherStationJaffna.addObservers(pD1);

        PhoneDisplay pD2 = new PhoneDisplay(weatherStationJaffna);
        weatherStationJaffna.addObservers(pD2);

        DesktopDisplay dD1 = new DesktopDisplay(weatherStationJaffna);
        weatherStationJaffna.addObservers(dD1);

        weatherStationJaffna.setTemperature(35.0);
        weatherStationJaffna.setTemperature(25.0);

        weatherStationJaffna.removeObserver(pD2);
        weatherStationJaffna.setTemperature(19.0);

        /**********************************************************************************************************/
    }
}
