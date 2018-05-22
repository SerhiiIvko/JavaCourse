package classworks.april.apr182018.homework.task3.task2.command;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Программа успешно завершена.");
        System.exit(1);
    }
}