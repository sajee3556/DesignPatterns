package factory;

/**
 * @author 212607214
 * @Date 6/18/2018
 */
public class OUTPurchaseReport extends AOUTReport {

    protected OUTPurchaseReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing OUT Reports Purchase specific stuff");
    }
}
