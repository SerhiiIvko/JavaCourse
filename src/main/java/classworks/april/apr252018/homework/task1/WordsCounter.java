package classworks.april.apr252018.homework.task1;

import java.io.*;
import java.util.*;

/**
 * Написать программу для подсчета наиболее встречающихся слов в неком тексте произведения Алиса в стране чудес.
 * Файл с текстом прилагается.
 * При выводе результатов привести первые 10 наиболее встречающихся слова с указанием их количества.
 * <p>
 * Пример вывода:
 * <p>
 * алиса: 406
 * сказала: 126
 * было: 105
 * сказал: 100
 * если: 87
 * только: 87
 * очень: 71
 * когда: 64
 * король: 61
 * подумала: 61
 * <p>
 * Подсчет слов не должен учитывать регистр и знаки препинания.
 * Вывести 10 наиболее часто встречающихся слов (это, и, а, на…такие слова не считать). Файл с текстом прилагается.
 * <p>
 * Подсказка:
 * Читайте информацию о работе с файлами, так же обратите внимание на класс Сканер, он может делать и так:
 * try (Scanner scanner = new Scanner(new InputStreamReader(new BufferedInputStream(new FileInputStream(filename)) , "UTF8")))
 */
public class WordsCounter {
    public static void main(String[] args) throws UnsupportedEncodingException {
        try {
            FileInputStream fis = new FileInputStream("alice.txt");
            BufferedInputStream bfis = new BufferedInputStream(fis);
            InputStreamReader isr = new InputStreamReader(bfis, "UTF8");
            Scanner scanner = new Scanner(isr);
            List<String> strings = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                strings.add(line);
            }
            String[] text = strings.toArray(new String[strings.size()]);
            String message = Arrays.toString(text);
            String[] words = message.toLowerCase().replaceAll("[-.?!)(,:;_]", " ").split("\\s");
            Map<String, Integer> counterMap = new HashMap<>();
            for (String word : words) {
                if (!word.isEmpty() && word.length() > 3) {
                    Integer count = counterMap.get(word);
                    if (count == null) {
                        count = 0;
                    }
                    counterMap.put(word, ++count);
                }
            }
            scanner.close();
            counterMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(10)
                    .forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}