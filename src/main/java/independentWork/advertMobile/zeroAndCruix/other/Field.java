package independentWork.advertMobile.zeroAndCruix.other;

import java.util.Scanner;

public class Field {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Decide the number of friends
        System.out.print("Enter how many friends: ");
        int numOfFriends = Integer.parseInt(scan.nextLine());

        //Create a string array to store the names of your friends
        String arrayOfNames[] = new String[numOfFriends];
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.print("Enter the name of friend " + (i+1) + " : ");
            arrayOfNames[i] = scan.nextLine();
        }

        //Now show your friend's name one by one
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.print("My friend " + (i+1) + " : ");
            System.out.print(arrayOfNames[i] + "\n");
        }
    }
//    public static void main(String[] args) {
//        String[][] field = new String[3][3];
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < field.length; i++) {
//
//            System.out.print("_");
//            for (int j = 0; j < field.length; j++) {
//                if (j % 2 == 0 || i % 2 == 0) {
//
//                } else {
//                    System.out.print("|");
//                }
////                field[i][j] = "_";
//
//            }
//            System.out.println();
//        }
//    }
}
