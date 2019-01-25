package command;

/**
 * @author 212607214
 * @Date 7/25/2018
 */
public class Receiver {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
