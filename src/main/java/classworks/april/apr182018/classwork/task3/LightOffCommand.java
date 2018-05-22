package classworks.april.apr182018.classwork.task3;

public class LightOffCommand implements Command {
    //reference to the light
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("Light off");
        light.switchOff();
    }
}