package independentWork.testSoftServe.aaa;

/**
 * Created by ivko on 06.04.18.
 */
public class Fruit implements IJuiceable, ISliceable {

    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String makeJuice() {
        return "Juice from " + name;
    }

    @Override
    public String makeSlices() {
        return "Slice of " + name;
    }
}
