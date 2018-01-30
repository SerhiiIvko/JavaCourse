package classworks.jan302018.task6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 6.Дано слово. Все данные в задании запрашиваем у пользователя. Вывести на экран:
 * a.Его третий символ
 * b.Его последний символ
 * c.Вывести на экран его k-символ
 * d.Посчитать сколько раз встречается m-символ
 */
public class Strings {
    public static void main(String[] args) {
        System.out.println("Input your word");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Input index of symbol");
        int index = scanner.nextInt();
        System.out.println("Input type of symbol");
        scanner.next();
        String character = scanner.nextLine();
        scanner.close();
        System.out.println("a. " + word.charAt(2));
        System.out.println("b. " + word.charAt(word.length() - 1));
        System.out.println("c. " + word.charAt(index));
        char w = character.charAt(0);
        int countChar = 0;
        char[] chars = new char[word.length()];
        System.out.println(Arrays.toString(chars));
//        for (int i = 0; i < chars.length-1; i++) {
//            if (w == chars[i]){
//                countChar++;
//            }
//        }
//        System.out.println(countChar);
    }
}
