package homeworks;

import java.util.Arrays;

public class FieldInArray {
    private static String fieldPattern = " [ ] ";
    static String ticPattern = " [X] ";
    static String tacPattern = " [O] ";

    public static void main(String[] args) {
        int inputSize = 3;
        String[] field = getField(inputSize);
        Arrays.stream(field).forEach(System.out::print);
        int player1Input1 = 2;
        int player2Input1 = 1;
        int player1Input2 = 5;
        int player2Input2 = 3;
        System.out.println();
        fillField(field, player1Input1);
        System.out.println();
        Arrays.stream(field).forEach(System.out::print);

    }

    private static String[] getField(int inputSize) {
        final int FIELD_SIZE = inputSize * inputSize;
        String[] field = new String[FIELD_SIZE];
        for (int i = 0; i < field.length; i++) {
            field[i] = fieldPattern;
            if (i != 0 && i % inputSize == 0) {
                field[i - 1] = field[i] + "\n\n";
            }
        }
        return field;
    }

    private static String[] fillField(String[] field, int inputIndex) {
        for (int i = 0; i < field.length; i++) {
            if (inputIndex == i) {
                field[i] = ticPattern;
            }
        }
        return field;
    }
}