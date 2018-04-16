package independentWork.testSoftServe.aaa;

/**
 * Created by ivko on 06.04.18.
 */
public class aaa {
    public static void main(String[] args) {
        Fresh fresh = new Fresh();
        fresh.addToJuices(new Fruit("apple"));
        fresh.addToJuices(new Fruit("peach"));
        fresh.addToSlices(new Fruit("grapes"));
        fresh.addToSlices(new Fruit("plums"));

        System.out.println(fresh.makeFresh());
    }
}
