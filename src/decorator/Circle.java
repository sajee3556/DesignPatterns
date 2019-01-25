package decorator;

/**
 * @author 212607214
 * @Date 6/15/2018
 */
public class Circle implements Shape {
    public Circle(){
        draw();
    }
    @Override
    public void draw() {
        System.out.println("Shape is: Circle");
    }
}
