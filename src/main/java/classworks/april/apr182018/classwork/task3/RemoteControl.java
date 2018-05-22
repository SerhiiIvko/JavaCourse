package classworks.april.apr182018.classwork.task3;

/**
 * Created by ivko on 17.05.18.
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
