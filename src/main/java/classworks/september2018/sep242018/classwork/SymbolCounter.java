package classworks.september2018.sep242018.classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SymbolCounter {
    public static void main(String[] args) {
//        getNumberChar("ccczzzssshhhaaammmmmmbddyyeeee");
        String input = "ccczzzssshhhaaammmmmmbddyyeeeeAAANNN";
        System.out.println("Input string: " + input);
        System.out.print("Output: ");
        getCharsCount(input);
    }

    private static void getNumberChar(String string) {
        Map<Character, Integer> numChars = new HashMap<>(Math.min(string.length(), 26));
        for (int i = 0; i < string.length(); i++) {
            char charAt = string.charAt(i);
            if (!numChars.containsKey(charAt)) {
                numChars.put(charAt, 1);
            } else {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }
        System.out.println(numChars);
    }

    private static void getCharsCount(String inputString) {
        char[] symbols = inputString.toCharArray();
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        for (char symbol : symbols) {
            String string = "" + symbol;
            int count = (int) IntStream.range(0, symbols.length)
                    .filter(j -> string.equals(symbols[j] + ""))
                    .count();
            stringIntegerMap.put(string, count);
        }
        String resultString = stringIntegerMap.entrySet()
                .stream()
                .map((entry) -> "" + entry.getValue().toString() + "" + entry.getKey())
                .collect(Collectors.joining(""));
        System.out.println(resultString);
    }
}