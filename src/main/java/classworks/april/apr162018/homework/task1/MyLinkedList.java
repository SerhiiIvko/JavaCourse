package classworks.april.apr162018.homework.task1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ivko on 17.04.18.
 */
public class MyLinkedList implements ICollections {
    private List<Integer> integerList;

    public MyLinkedList() {
        this.integerList = new LinkedList<>();
    }

    @Override
    public void addElement(int sizeOfLinkedList, int startRange, int endRange) {
        if (startRange < endRange) {
            int tmp;
            tmp = startRange;
            startRange = endRange;
            endRange = tmp;
        }
        for (int i = 0; i < sizeOfLinkedList; i++) {
            integerList.add((int) (startRange + Math.random() * endRange));
        }
    }

    @Override
    public String toString() {
        return "My LinkedList: " + integerList;
    }
}