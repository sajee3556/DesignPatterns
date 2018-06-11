package strategy;

/**
 * @author 212607214
 * @Date 6/4/2018
 */
public class LongJump implements IJumpBehavior {
    @Override
    public void jump() {
        System.out.println("I can jump up to 100 m");
    }
}
