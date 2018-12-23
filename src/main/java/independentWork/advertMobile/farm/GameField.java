package independentWork.advertMobile.farm;

import java.util.ArrayList;
import java.util.List;

public class GameField {
    public static int SIZE = 8;

    public static void initField() {
        String cellPattern = "[ Bed ready for planting seed ]";
        List<String> field = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            if (field.get(i) == null) {
                field.add(cellPattern);
            }
        }
//        String[] field = new String[SIZE];
//        for (int i = 0; i < SIZE; i++) {
//            field[i] = cellPattern;
//        }

        showField(field);
    }

    private static void showField(List<String> field) {
        System.out.print("Current farm statement:\n");
        System.out.println(field);
//        field.forEach(System.out::println);
//        for (int p = 0; p < SIZE; p++) {
//            System.out.println();
//            System.out.print(field[p]);
//        }
        System.out.println();
    }
//    private static void showField(String[] field) {
//        System.out.print("Current farm statement:");
//        for (int p = 0; p < SIZE; p++) {
//            System.out.println();
//            System.out.print(field[p]);
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        initField();
//    }
}
