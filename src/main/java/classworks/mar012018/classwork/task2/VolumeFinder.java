package classworks.mar012018.classwork.task2;

public class VolumeFinder {
    public static void main(String[] args) {
        Figure figure = new Figure();
        Figure figure1 = new Figure();
        double volume;
        figure.setParameters(2, 3, 5);
        figure1.setParameters(3, 4, 6);

        volume = figure.volume();
        System.out.println("Volume of figure is " + volume);

        volume = figure1.volume();
        System.out.println("Volume of figure1 is " + volume);
    }
}