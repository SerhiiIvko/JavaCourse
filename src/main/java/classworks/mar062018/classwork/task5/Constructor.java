package classworks.mar062018.classwork.task5;

public class Constructor {
    private int x;
    private int sum;

    public int getX() {
        return x;
    }

    Constructor() {
        System.out.println("Empty constructor = " + (this.x = 0));

    }

    Constructor(int i) {
        System.out.println("X = i = " + (this.x = i));
    }

    Constructor(double d) {
        System.out.println("X = d = " + (this.x = (int) d));
    }

    Constructor(int y, int z) {
        sum = 0;
        System.out.println("X = y * z = " + (this.x = y * z));
    }

    Constructor(Constructor constr) {
        sum = constr.getX() + getX();
    }
}
