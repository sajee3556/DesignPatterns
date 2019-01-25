package factory;

/**
 * @author 212607214
 * @Date 6/18/2018
 */
public class INPurchaseReport extends AINReport {

    protected INPurchaseReport(String name) {
        super(name);
    }

    @Override
    public void processReport(){
        super.processReport();
        System.out.println("Performing IN Reports Purchase specific stuff");
    }
}
