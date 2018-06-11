package strategy;

/**
 * @author 212607214
 * @Date 6/4/2018
 */
public class Player {
    IJumpBehavior jumpBehavior;
    IRunBehavior runBehavior;
    ISpecialPower specialPower;

    /*
    * here we consider compostion over inheritance
     */

    public  Player(IJumpBehavior jumpBehavior,IRunBehavior runBehavior,ISpecialPower specialPower){
        this.jumpBehavior = jumpBehavior;
        this.runBehavior = runBehavior;
        this.specialPower = specialPower;
    }

    public void jump(){
        this.jumpBehavior.jump();
    }

    public void run(){
        this.runBehavior.run();
    }

    public void showMyPower(){
        this.specialPower.executePower();
    }
}
