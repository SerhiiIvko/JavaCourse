package classworks.april.apr182018.classwork.task2;

import java.util.ArrayList;

public class ManagerCommands {
    private ArrayList<Command> listCommands = new ArrayList<>();

    public void addCommand(Command command) {
        listCommands.add(command);
    }

    public void run() {
        for (int i = 0; i < listCommands.size(); i++) {
            Command command = listCommands.get(i);
            command.execute();
        }
    }
}