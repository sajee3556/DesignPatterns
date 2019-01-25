package factory;

/**
 * @author 212607214
 * @Date 6/18/2018
 */
public abstract class AINReport extends AReport {

    protected AINReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {

        super.processReport();
        System.out.println("Performing IN Reports common stuff");

    }
}
