package classworks.mar202018.homework.task1;

import classworks.mar202018.homework.task1.command.AddShapeCommand;
import classworks.mar202018.homework.task1.command.Command;
import classworks.mar202018.homework.task1.command.ExitCommand;
import classworks.mar202018.homework.task1.command.PrintCommand;
import classworks.mar202018.homework.task1.shape.ShapeType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1) Задача: создать программу, которая отображает следующее меню и запрашивает у пользователя соответствующую информацию:
 * 1) Введите блок
 * 2) Введите сферу
 * 3) Введите пирамиду
 * 4) Показать данные
 * 5) Выход
 * Если пользователь выбирает
 * вариант 1, попросите пользователя ввести длину блока, ширину и высоту
 * Вариант 2, попросите пользователя ввести радиус сферы
 * Вариант 3, попросите пользователя ввести длину и ширину основания, а затем высоту пирамиды
 * Вариант 4 должен отображать все введенные фигуры, а также объем и площадь каждой фигуры. После отображения всех данных
 * также отображается средний объем и средняя площадь поверхности всех введенных фигур.
 * Пользователь должен иметь возможность вводить до 10 фигур. Предположим, что все введенные данные действительны (т. е.
 * Вам не нужно проверять наличие отрицательных чисел для размеров фигуры или «плохих» символов и т. Д.).
 * * Иерархия наследования классов должна быть реализована, и основная программа должна использовать полиморфизм для
 * управления и отображения данных формы. Вы можете использовать либо интерфейсы Java, либо абстрактные классы, и
 * абстрактные методы.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeManager shapeManager = new ShapeManager();

        Map<Integer, Command> menu = new HashMap<>();
        menu.put(1, new AddShapeCommand(ShapeType.BLOCK, shapeManager, scanner));
        menu.put(2, new AddShapeCommand(ShapeType.SPHERE, shapeManager, scanner));
        menu.put(3, new AddShapeCommand(ShapeType.PYRAMID, shapeManager, scanner));
        menu.put(4, new PrintCommand(shapeManager));
        menu.put(5, new ExitCommand());

        String description = " * 1) Введите блок\n" +
                " * 2) Введите сферу\n" +
                " * 3) Введите пирамиду\n" +
                " * 4) Показать данные\n" +
                " * 5) Выход";

        while (true) {
            System.out.println(description);
            int id = scanner.nextInt();
            if (id >= 1 && id <= 5) {
                Command command = menu.get(id);
                command.execute();
            }
        }
    }
}