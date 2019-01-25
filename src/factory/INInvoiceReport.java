package factory;

/**
 * @author 212607214
 * @Date 6/18/2018
 */
public class INInvoiceReport extends AINReport {

    protected INInvoiceReport(String name) {
        super(name);
    }

    @Override
    public void processReport() {
        super.processReport();
        System.out.println("Performing IN Reports Invoice specific stuff");
    }

}
