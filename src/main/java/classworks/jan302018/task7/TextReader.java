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
        int index = 0;
        int counter = 0;
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length; i++) {

        }
    }
}
