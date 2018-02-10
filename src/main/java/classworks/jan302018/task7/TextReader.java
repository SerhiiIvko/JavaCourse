package classworks.jan302018.task7;

import java.util.Scanner;

/**
 * 7.Запросить у пользователя текст на английском языке. Найти сколько раз в тексте встречается буква e (без
 * учета регистра) и на каких позициях они стоят (индексы).
 * a.Выполнить задачу используя только цикл
 * b.Выполнить задачу используя цикл (не перебирая всю строку) и методы класса String
 * (https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) contains и indexOf.
 */
public class TextReader {
    public static void main(String[] args) {
        System.out.println("Input your text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        char e = 'e';
        int counter = 0;
        text = text.toLowerCase();
        char[] array = text.toCharArray();
        System.out.println("A");
        System.out.print("Буква 'e' встречается в тексте по индексам ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) {
                counter++;
                System.out.print(i + ", ");
            }
        }

        System.out.println();
        System.out.println(String.format("Буква 'e' встречается в тексте %d раз", counter));
        StringBuilder stringBuilder = new StringBuilder();
        counter = 0;
        int index = -1;
        String delimiter = ", ";
        do {
            index++;
            index = text.indexOf("e", index);
            if (index >= 0) {
                stringBuilder.append(index).append(delimiter);
                counter++;
            }
        } while (index > 0 && index < text.length());
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - delimiter.length());
        }
        System.out.println("B");
        System.out.println(String.format("Буква 'e' встречается в тексте по индексам %s", stringBuilder.toString()));
        System.out.println("Буква 'e' встречается в тексте " + (counter) + " раз");
    }
}