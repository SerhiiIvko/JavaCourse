package classworks.mar062018.classwork.task6;
//Добавить в класс конструктор, который в качестве параметра будет принимать объект.
//Создать конструктор, используемый при указании всех параметров.
//Создать конструктор, если параметры не указаны, использовать -1 для обозначения непроинициализированного параллелепипеда
//Конструктор, используемый при создании куба
//Создать параллелепипеды, используя разные конструкторы(клона тоже)
//Получить объем первого и второго параллелепипеда
//Получить объем куба
//Получить объем клона

class Block {
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

    Block() {

        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    Block(Block block) {
        block.a = this.a;
        block.b = this.b;
        block.c = this.c;
    }

    Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isBlockCube() {
        if (this.a == this.b && this.b == this.c) {
            System.out.println("Cube");
            return true;
        } else {
            return false;
        }
    }
}

class BlockRunner {
    public static void main(String[] args) {
        Block b1 = new Block();
        Block b2 = new Block(10, 10, 10);
        Block b3 = new Block(4, 5, 5);
        Block clone = new Block(b3);


        System.out.println(b1.getA() + " " + b1.getB() + " " + b1.getC());

        System.out.println(b2.isBlockCube());

        System.out.println(b3.calculateVolume());

        System.out.println(clone.calculateVolume());
    }
}