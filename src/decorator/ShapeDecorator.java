package decorator;

/**
 * @author 212607214
 * @Date 6/15/2018
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
        draw();
        paint();
    }

    public void draw(){
        decoratedShape.draw();
    }

    abstract void paint();
}
