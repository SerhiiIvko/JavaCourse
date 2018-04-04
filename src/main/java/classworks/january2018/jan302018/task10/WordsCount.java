package classworks.january2018.jan302018.task10;

import java.util.Scanner;

/**
 * 10.Дано предложение. Определить кол-во слов в предложении.
 */
public class WordsCount {
    public static void main(String[] args) {
        System.out.println("Input sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();

        String[] strings = sentence.split("[\\s|,|\\.|;|:|\\?|!]");
        String[] filteredStrings = new String[strings.length];
        int filteredStringsIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].isEmpty()) {
                filteredStrings[filteredStringsIndex++] = strings[i];
            }
        }
        strings = new String[filteredStringsIndex];
        System.arraycopy(filteredStrings, 0, strings, 0, filteredStringsIndex);
        System.out.println("Words in the sentence: " + strings.length);
    }
}