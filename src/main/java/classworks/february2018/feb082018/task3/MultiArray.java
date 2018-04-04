package classworks.february2018.feb082018.task3;

import java.util.Random;

public class MultiArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] array = new int[5][5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    Random r = new Random(12);
                    System.out.print(r.nextInt(100) + " ");
                    System.out.println(r.nextInt(100));
//                    array[i][j][k] = random.nextInt(100);
                }
            }
        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 5; k++) {
//                    System.out.print(array[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


//        System.out.println("2D array");
//        int[][] array = new int[5][10];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < 10; j++) {
//                array[i][j] = j + 1;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println("3D array");
//        int[][][] arr2 = new int[4][5][6];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 6; k++) {
//                    arr2[i][j][k] = (int) (Math.random() * 10);
//                }
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 6; k++) {
//                    System.out.print(arr2[i][j][k] + "  ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
    }
}
