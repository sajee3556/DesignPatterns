package factory;

/**
 * @author 212607214
 * @Date 6/18/2018
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {


        /*
        * The advantages of modeling this type of problems with a solution based on a design pattern like the Abstract
        * Factory are its flexibility and scalability, given mainly by the following aspects:
        * Archive depends only on interfaces and does not know anything about how the concrete factories and
        * the related reports are created
        * Adding a new category of reports has no impact on the Archive client class, but it is easily handled in
        * FactoryProvider, simply adding a new case in the switch statement for the instantiation of the new concrete
        * factory
        * Adding a new type of report to an existing category is completely transparent to both the Archive and
        * FactoryProvider classes and it is simply handled in the category concrete factory by adding a new case in
        * the switch statement
        * The FactoryProvider is completely decoupled and can be reused anywhere
         */

        String [] reports = {"IN_INV_001.txt","OUT_PUR_001.txt","IN_INV_002.txt", "IN_PUR_001.txt", "OUT_PUR_002.txt", "OUT_INV_001.txt", "IN_INV_003.txt"};
        String tmp[] = null;

        Archive a = new Archive();

        for (String s: reports) {
            tmp = s.split("_");
            a.addReport(tmp[0], tmp[1], s);
        }

        a.processAllReports();

    }
}
