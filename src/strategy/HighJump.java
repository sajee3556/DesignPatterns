package strategy;

/**
 * @author 212607214
 * @Date 6/4/2018
 */
public class HighJump implements IJumpBehavior {
    @Override
    public void jump() {
        System.out.println("I can jump over 7 stories");
    }
}
