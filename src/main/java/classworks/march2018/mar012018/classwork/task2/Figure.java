package classworks.march2018.mar012018.classwork.task2;

/**
 * найти объем параллелепипеда, засетив ему параметры сторон
 */
public class Figure {
    public int lenght;
    public int high;
    public int weidth;

    public void setParameters(int l, int h, int w) {
        lenght = l;
        high = h;
        weidth = w;
    }

    public double volume() {
        return lenght * high * weidth;
    }
}