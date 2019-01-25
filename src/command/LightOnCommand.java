package command;

/**
 * @author 212607214
 * @Date 7/25/2018
 */
public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.On();
    }
}
