package classworks.mar022018.classwork.task2;

public class VolumeFinder {
    public static void main(String[] args) {
        Figure figure = new Figure(2, 3, 5);
        Figure figure1 = new Figure(3, 4, 6);

        System.out.println("Volume of figure is " + figure.volume());

        System.out.println("Volume of figure1 is " + figure1.volume());

        figure.setLenght(5);
        figure.setHigh(2);
        System.out.println("Volume of figure is " + figure.volume());

        figure1.setWeidth(8);
        System.out.println("Volume of figure1 is " + figure1.volume());
    }
}