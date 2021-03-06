package classworks.march2018.mar202018.homework.task1.command;

import classworks.march2018.mar202018.homework.task1.ShapeManager;

public class PrintCommand implements Command {
    private ShapeManager manager;

    public PrintCommand(ShapeManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.print();
    }
}