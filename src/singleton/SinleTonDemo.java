package singleton;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class SinleTonDemo {
    public static void main(String[] args) {
         /*
        * only one instance and provides a global point of access to it
        */

        CommonObject instance1 = CommonObject.getInstance();
        instance1.askMe();
        System.out.println();
        CommonObject instance2 = CommonObject.getInstance();
        instance2.askMe();
        System.out.println("*************************");
        System.out.println();

        /**********************************************************************************************************/

    }
}
