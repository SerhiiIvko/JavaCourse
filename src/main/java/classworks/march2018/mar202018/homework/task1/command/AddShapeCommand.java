package classworks.march2018.mar202018.homework.task1.command;

import classworks.march2018.mar202018.homework.task1.shape.Shape;
import classworks.march2018.mar202018.homework.task1.ShapeManager;
import classworks.march2018.mar202018.homework.task1.shape.ShapeType;

import java.util.Scanner;

public class AddShapeCommand implements Command {
    private ShapeType type;
    private ShapeManager shapeManager;
    private Scanner scanner;

    public AddShapeCommand(ShapeType type, ShapeManager shapeManager, Scanner scanner) {
        this.type = type;
        this.shapeManager = shapeManager;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        if (shapeManager.isFull()) {
            System.out.println("Вы добавили максимальное количество фигур!");
        } else {
            Shape shape = Shape.create(type, scanner);
            shapeManager.addShape(shape);
        }
    }
}