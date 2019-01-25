package factory;

/**
 * @author 212607214
 * @Date 6/18/2018
 */
public class FactoryProvider {
    public static IReportFactory getFactory(String factoryType) {
        IReportFactory rf = null;
        switch(factoryType) {
            case "IN":
                rf = new INReportFactory();
                break;
            case "OUT":
                rf = new OUTReportFactory();
                break;
            default:
                break;
        }
        return rf;
    }
}
