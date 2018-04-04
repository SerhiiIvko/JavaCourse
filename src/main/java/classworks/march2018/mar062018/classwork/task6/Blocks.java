package classworks.march2018.mar062018.classwork.task6;

/**
 * В существующий класс параллелепипед добавить конструктор, который в качестве параметра будет принимать объект.
 * Конструктор используемый при указании всех размеров.
 * Конструктор  используемый если не один из размеров не указан - использовать -1 для обозначения неинициализированного
 * параллелепипеда.
 * А также конструктор используемый при создании куба.
 * Создать параллелепипеды используя разные конструкторы(клона тоже).
 * Получить объем первого и второго параллелепипеда.
 * Получить объем куба.
 * ПОлучить объем клона.
 */
public class Blocks {
    private int a, b, c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int calculateVolume() {
        return a * b * c;
    }

    Blocks() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    Blocks(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("Incorrect parameters for block");
        }
    }

    Blocks(int side) {
        if (side > 0) {
            this.a = side;
            this.b = side;
            this.c = side;
        } else {
            System.out.println("Incorrect parameters for block");
        }
    }

    Blocks(Blocks block) {
        this.a = block.a;
        this.b = block.b;
        this.c = block.c;
    }

    boolean isBlockCube() {
        if (this.a == this.b && this.b == this.c) {
            return true;
        } else {
            return false;
        }
    }
}