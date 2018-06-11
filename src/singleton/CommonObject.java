package singleton;

/**
 * @author 212607214
 * @Date 6/1/2018
 */
public class CommonObject {
    private static CommonObject instance = null;

    private CommonObject(){
        sayHello();
    }

    public static CommonObject getInstance() {
        if(instance == null){
            instance = new CommonObject();
        }
        return instance;
    }

    private void sayHello() {
        System.out.println("Hello: ");
    }

    public void askMe(){
        System.out.println("Ahaan: ");
    }
}
