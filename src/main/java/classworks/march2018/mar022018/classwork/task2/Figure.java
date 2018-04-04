package classworks.march2018.mar022018.classwork.task2;

/**
 * найти объем параллелепипеда, засетив ему параметры сторон
 */
public class Figure {
    public int lenght;
    public int high;
    public int weidth;

    Figure(int l, int h, int w) {
        this.lenght = l;
        this.high = h;
        this.weidth = w;
    }

    public double volume() {
        return lenght * high * weidth;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setWeidth(int weidth) {
        this.weidth = weidth;
    }
}