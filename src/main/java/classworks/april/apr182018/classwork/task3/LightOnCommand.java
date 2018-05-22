package classworks.april.apr182018.classwork.task3;

public class LightOnCommand implements Command {
    //reference to the light
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("Light on");
        light.switchOn();
    }
}