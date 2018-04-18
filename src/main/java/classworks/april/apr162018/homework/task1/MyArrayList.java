package classworks.april.apr162018.homework.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivko on 17.04.18.
 */
public class MyArrayList implements ICollections {
    private List<Integer> arrayList;

    public MyArrayList() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void addElement(int sizeOfArrayList, int startRange, int endRange) {
        if (startRange < endRange) {
            int tmp;
            tmp = startRange;
            startRange = endRange;
            endRange = tmp;
        }
        for (int i = 0; i < sizeOfArrayList; i++) {
            arrayList.add((int) (startRange + Math.random() * endRange));
        }
    }

    @Override
    public String toString() {
        return "My ArrayList: " + arrayList;
    }
}