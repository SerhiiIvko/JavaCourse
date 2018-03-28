package classworks.mar202018.homework.task1.command;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Программа успешно завершена.");
        System.exit(1);
    }
}