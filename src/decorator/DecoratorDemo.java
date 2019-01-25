package decorator;

/**
 * @author 212607214
 * @Date 6/15/2018
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        /*
        *  Best example for Decorator Pattern is
        *  JAva I/O Streams
         */
        System.out.println("Circle Created: ");
        Circle circle = new Circle();

        System.out.println();
        System.out.println("Rectangle Created: ");
        Rectangle rectangle = new Rectangle();

        /* Now I want a red boarded Circle
        * first create then decorated possible
        * instead 0f that I used decorated pattern
        * wrapping class do both..
        */
        System.out.println();
        System.out.println("RedBoarder Cicle creation");
        new RedBoarderDecorator(circle);

        System.out.println();
        System.out.println("RedBoarder Rectangle creation");
        new RedBoarderDecorator(rectangle);
    }
}
