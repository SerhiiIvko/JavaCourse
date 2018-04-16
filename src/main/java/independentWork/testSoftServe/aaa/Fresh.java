package independentWork.testSoftServe.aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ivko on 06.04.18.
 */
public class Fresh {
    private List<IJuiceable> juices;
    private List<ISliceable> slices;

    public Fresh() {
        juices = new ArrayList<>();
        slices = new ArrayList<>();
    }

    public void addToJuices(IJuiceable juiceable) {
        juices.add(juiceable);
    }

    public void addToSlices(ISliceable sliceable) {
        slices.add(sliceable);
    }

    public String makeJuice() {
        if (juices.size() == 0) {
            throw new IllegalStateException("No fruits for juice");
        }
        return juices.stream().map(IJuiceable::makeJuice).collect(Collectors.joining(", "));
    }

    public String makeSlices() {
        if (juices.size() == 0) {
            throw new IllegalStateException("No fruits for slices");
        }
        return slices.stream().map(ISliceable::makeSlices).collect(Collectors.joining(", "));
    }

    public String makeFresh() {
        String fresh = "";
        try {
            fresh = makeJuice() + ", " + makeSlices();
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
        }
        return fresh;
    }
}