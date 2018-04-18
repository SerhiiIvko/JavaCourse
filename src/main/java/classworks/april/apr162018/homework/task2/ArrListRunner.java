package classworks.april.apr162018.homework.task2;

import java.util.ArrayList;

/**
 * В кругу стоят N человек, пронумерованных от 1 до N. При ведении счета по кругу вычеркивается каждый второй человек,
 * пока не останется один. Составить две программы, моделирующие процесс. Одна из программ должна использовать
 * класс ArrayList, а вторая — LinkedList. Какая из двух программ работает быстрее? Почему?
 */
public class ArrListRunner {
    public static void main(String[] args) {
        System.out.println("ArrayList realization");
        long before = System.currentTimeMillis();
        System.out.println("Start time: " + before);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ivan");
        arrayList.add("Petro");
        arrayList.add("Nikolay");
        arrayList.add("Danil");
        arrayList.add("Vasya");
        arrayList.add("Sergey");
        arrayList.add("Yuriy");
        arrayList.add("Andrey");
        arrayList.add("Ilya");
        arrayList.add("Vova");
        arrayList.add("Evgeniy");
        if (!arrayList.isEmpty()) {
            for (int i = arrayList.size() - 1; i > 0; i--) {
                if (i % 2 != 0) {
                    System.out.println("Out " + arrayList.get(i));
                }
            }
        } else {
            System.out.println("Add people please!");
        }
        System.out.println("Stayed " + arrayList.get(0));
        long after = System.currentTimeMillis();
        System.out.println("End time: " + after);
        long difference = after - before;
        System.out.println("All time = " + difference);//Max result = 3, Min result = 0
    }
}