package classworks.april.apr232018.homework.task2;

import java.util.*;

/*
TASK 1
1. Создайте проект MapSetTester с классом MapSetTester и методом main. Вы будете использовать классы HashMap и TreeSet
2. В методе main создайте словарь HashMap с именем networkMap, в котором будут храниться данные в виде пары ключ и
   значение, где ключ - имя телеканала, а связанное значение - это множество типа TreeSet, который содержит телевизионные
   шоу для этого телеканала:
HashMap <______, ______> networkMap = new HashMap <______, ______> ();
/*
TASK 2
В цикле запросите у пользователя название телешоу, а затем запросите пользователя ввести имя телевизионного канала
для этого шоу. После того, как у вас появяться исходные данные, найдите канал в словаре networkMap.
Если канал еще не добавлен в словарь, создайте множество TreeSet в которое добавть название телешоу, а затем добавьте
ключ к паре значений (канал, с заданным телевизионным шоу) в словарь.
Если канал находится в словаре, добавьте телешоу к множеству TreeSet этого телеканала.
Таким образом введите не менее 10 телевизионных шоу.
После обновления словаря выведите его содержимое.
Пример вывода (обратите внимание, что сети не расположены в лексикографическом порядке, но телевизионные
шоу для каждого канала - в лексикографическом порядке ... почему?):

   Input tv network: FOX
   Input tv show on FOX: The Simpsons
   {FOX=[The Simpsons]}

   Input tv network: NBC
   Input tv show on NBC: ER
   {FOX=[The Simpsons], NBC=[ER]}

   Input tv network: ABC
   Input tv show on ABC: 20/20
   {FOX=[The Simpsons], NBC=[ER], ABC=[20/20]}

   Input tv network: CBS
   Input tv show on CBS: Survivor
   {CBS=[Survivor], FOX=[The Simpsons], NBC=[ER], ABC=[20/20]}

   Input tv network: ABC
   Input tv show on ABC: Lost
   {CBS=[Survivor], FOX=[The Simpsons], NBC=[ER], ABC=[20/20, Lost]}

   Input tv network: FOX
   Input tv show on FOX: Family Guy
   {CBS=[Survivor], FOX=[Family Guy, The Simpsons], NBC=[ER], ABC=[20/20, Lost]}

   Input tv network: CBS
   Input tv show on CBS: CSI
   {CBS=[CSI, Survivor], FOX=[Family Guy, The Simpsons], NBC=[ER], ABC=[20/20, Lost]}

   Input tv network: FOX
   Input tv show on FOX: American Idol
   {CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER], ABC=[20/20, Lost]}

   Input tv network: ABC
   Input tv show on ABC: Desperate Housewives
   {CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER], ABC=[20/20, Desperate Housewives, Lost]}

   Input tv network: NBC
   Input tv show on NBC: Law And Order
   {CBS=[CSI, Survivor], FOX=[American Idol, Family Guy, The Simpsons], NBC=[ER, Law And Order], ABC=[20/20, Desperate Housewives, Lost]}

TASK 3
Если у вас есть словарь с кналами, выведите содержимое словаря алфавитном порядке каналов, по одному кналу в каждой
строке.
Создайте массив, содержащий ключи (названия каналов) словаря networkMap.
Отсортируйте полученный массив каналов по алфавиту.
Переберите элементы массива ключей, чтобы получить соответствующее значение (наборы ТВ-шоу) для каждого
ключа из словаря и распечатать их.
(Примечание: Вам не придется сортировать ТВ-шоу для канала, так как они уже будут отсортированы ... почему?)
*/
public class MapSetTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, TreeSet> networkMap = new HashMap<>();
        int counter = 0;
        while (counter < 10) {
            System.out.print("Input tv network: ");
            String channel = scanner.nextLine();
            System.out.print("Input tv show: ");
            String show = scanner.nextLine();
            if (!networkMap.containsKey(channel)) {
                TreeSet<String> treeSet = new TreeSet<>();
                treeSet.add(show);
                networkMap.put(channel, treeSet);
                System.out.println(networkMap.toString());
            } else if (!networkMap.containsValue(show)) {
                networkMap.get(channel).add(show);
                System.out.println(networkMap.toString());
            }
            counter++;
        }
        Set<String> channels = networkMap.keySet();
        Object[] channelsToArray = channels.toArray();
        Arrays.sort(channelsToArray);
        System.out.println("Sorted channels: ");
        for (Object channel : channelsToArray)
            System.out.println(channel);
        System.out.println("TV shows: ");
        for (TreeSet ch : networkMap.values()) {
            System.out.println(ch.toString());
        }
    }
}