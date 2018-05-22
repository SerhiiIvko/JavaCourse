package classworks.may2018.may162018.classwork.task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo7 {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        /*new ArrayList<>();*//*(Arrays.asList(1,2,3,4,5));Arrays.asList(1,2,3,4,5);*/
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add(6);
        }
        System.out.println("----------");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //System.out.println(list);
    }
}