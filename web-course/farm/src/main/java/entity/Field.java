package entity;

public class Field {
    private static final int SIZE = 8;

    public static void initField() {
        String cellPattern = "[Bed ready for planting]";
        String[] field = new String[SIZE];
        for (int i = 0; i < SIZE; i++) {
            field[i] = cellPattern;
        }
        showField(field);
    }

    private static void showField(String[] field) {
        System.out.print("Current farm statement");
        for (int p = 0; p < SIZE; p++) {
            System.out.println();
            System.out.print(field[p]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        initField();
    }
}
