package factory;

/**
 * @author 212607214
 * @Date 6/18/2018
 */
public class AReport {

    protected String name;

    protected AReport(String name) {
        this.name = name;
    }

    public void processReport() {
        System.out.println("Processing report: " + this.name);
    }

}
