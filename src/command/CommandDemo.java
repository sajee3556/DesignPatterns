package command;

/**
 * @author 212607214
 * @Date 7/25/2018
 */
public class CommandDemo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        receiver.setCommand(lightOnCommand);
        receiver.action();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        receiver.setCommand(lightOffCommand);
        receiver.action();

    }
}
