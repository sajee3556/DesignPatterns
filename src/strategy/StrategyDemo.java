package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class StrategyDemo {
    public static void main(String[] args) {

        /*
        * Strategy Design pattern demo
        */
        List<Player> playerList = new ArrayList<>() ;
        Player  blackPanther = new Player(new LongJump(),new SuperFast(),new ThunderPunch());
        playerList.add(blackPanther);
        Player crazyRobot = new Player(new HighJump(),new SuperFast(),new IronMan());
        playerList.add(crazyRobot);
        Player snakeBabu = new Player(new HighJump(),new Zigzag(),new ThunderPunch());
        playerList.add(snakeBabu);
        Player snakeRobot = new Player(new HighJump(),new Zigzag(),new IronMan());
        playerList.add(snakeRobot);
        playerList.stream().forEach(player -> {
            System.out.println();
            player.jump();
            player.run();
            player.showMyPower();
            System.out.println();
        });
        System.out.println("*************************");

        /**********************************************************************************************************/

    }
}
