package decorator;

/**
 * @author 212607214
 * @Date 6/15/2018
 */
public class RedBoarderDecorator extends ShapeDecorator {

    public RedBoarderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    void paint() {
        System.out.println("Red painted border");
    }
}
