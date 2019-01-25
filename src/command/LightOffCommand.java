package command;

/**
 * @author 212607214
 * @Date 7/25/2018
 */
public class LightOffCommand implements Command {
    private  Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.Off();
    }
}
