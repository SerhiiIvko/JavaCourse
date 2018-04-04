package classworks.february2018.feb062018.homework.task3;

import java.util.Arrays;

/**
 * 3)Создайте массив содержащий марки автомобилей, отсортируйте его сначала по возрастанию, потом по убыванию.
 */
public class Automobile {
    public static void main(String[] args) {
        String[] auto = {"BMW", "Honda", "Audi", "Lexus", "Daewoo", "Hundai", "Dacia", "Aar", "Mercedes", "Fiat",
                "Renault", "Ford"};
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(auto));
        System.out.println();
        for (int i = 1; i < auto.length - 1; i++) {
            for (int j = 1; j < auto.length; j++) {
                if ((auto[j].compareToIgnoreCase(auto[j - 1])) <= 0) {
                    String tmp = auto[j - 1];
                    auto[j - 1] = auto[j];
                    auto[j] = tmp;
                }
            }
        }
        System.out.println("Sorted array by increase:");
        System.out.println(Arrays.toString(auto));
        System.out.println();
        System.out.println("Sorted array by decrease:");
        for (int i = 0; i < auto.length; i++) {
            for (int j = auto.length - 1; j > 0; j--) {
                if (auto[j].compareToIgnoreCase(auto[j - 1]) >= 0) {
                    String tmp = auto[j];
                    auto[j] = auto[j - 1];
                    auto[j - 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(auto));
    }
}