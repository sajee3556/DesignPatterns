package decorator;

/**
 * @author 212607214
 * @Date 6/15/2018
 */
public class Rectangle implements Shape {
    public Rectangle(){
        draw();
    }
    @Override
    public void draw() {
        System.out.println("The shape is: Rectangle");
    }
}
