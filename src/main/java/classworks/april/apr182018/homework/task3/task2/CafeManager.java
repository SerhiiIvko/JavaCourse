package classworks.april.apr182018.homework.task3.task2;

import classworks.april.apr182018.homework.task3.task2.command.Command;

import java.util.List;
import java.util.Scanner;

public class CafeManager {
    private Menu menu;
    private List<Command> commands;
    private double totalScore;
    private Scanner scanner;

    public CafeManager(Menu menu, List<Command> commands) {
        this.menu = menu;
        this.commands = commands;
    }

    public void work() {
        String description = " * 1) Сделать заказ\n" +
                " * 2) Показать счёт\n" +
                " * 3) Выход\n";
        while (true) {
            System.out.println(description);
            System.out.print("Enter operation code: ");
            int id = scanner.nextInt();
            if (id >= 1 && id <= 3) {
                Command command = commands.get(id - 1);
                command.execute();
            }
        }
    }
}