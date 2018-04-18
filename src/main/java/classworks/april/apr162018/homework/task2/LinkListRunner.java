package classworks.april.apr162018.homework.task2;

import java.util.LinkedList;

/**
 * Created by ivko on 18.04.18.
 */
public class LinkListRunner {
    public static void main(String[] args) {
        System.out.println("LinkedList realization");
        long before = System.currentTimeMillis();
        System.out.println("Start time: " + before);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ivan");
        linkedList.add("Petro");
        linkedList.add("Nikolay");
        linkedList.add("Danil");
        linkedList.add("Vasya");
        linkedList.add("Sergey");
        linkedList.add("Yuriy");
        linkedList.add("Andrey");
        linkedList.add("Ilya");
        linkedList.add("Vova");
        linkedList.add("Evgeniy");
        if (!linkedList.isEmpty()) {
            for (int i = linkedList.size() - 1; i > 0; i--) {
                if (i % 2 != 0) {
                    System.out.println("Out " + linkedList.get(i));
                }
            }
        } else {
            System.out.println("Add people please!");
        }
        System.out.println("Stayed " + linkedList.get(0));
        long after = System.currentTimeMillis();
        System.out.println("End time: " + after);
        long difference = after - before;
        System.out.println("All time = " + difference);//Max result = 6, Min result = 1
    }
}