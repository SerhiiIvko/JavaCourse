package independentWork.work2.task6;

/*Ученикам первого класса дают 1 пирожок, если вес первоклассника менее 30 кг
дополнительно дают 1 стакан молока и еще 1 пирожок. В первых классах школы учится
n учеников. Стакан молока имеет емкость 200 мл, а упаковки молока – 0,9 л. Написать
программу которая определит количество пакетов молока и пирожков, необходимых
каждый день для условий:
a. Если в школе 100% всех учеников, у которых вес меньше 30 кг.
b. Если в школе 60% учеников, имеют вес меньше 30 кг.
Учесть, что нужно купить целое количество пакетов молока.
*/

import java.util.Scanner;

public class MilkInSchool {
    public static void main(String[] args) {
        System.out.println("Input how much pupils in elementary classes");
        Scanner scanner = new Scanner(System.in);
        int pupils = scanner.nextInt();
        scanner.close();

        int pupilLower30kgA = pupils * 1;
        int pupilLower30kgB = (int) (pupils * 0.6);
        int piesForPupil = 1;
        double milkForPupil = 0.2;
        double milkInPackage = 0.9;
        int piesForDay;
        double milkForDay;
        piesForDay = (piesForPupil + 1) * pupilLower30kgA;
        milkForDay = (milkForPupil * pupilLower30kgA) / milkInPackage;
        milkForDay = Math.ceil(milkForDay);
        System.out.println("A. Need " + piesForDay + " pies and " + milkForDay + " packages of milk");

        System.out.println();
        piesForDay = (piesForPupil * (pupils - pupilLower30kgB)) + (piesForPupil + 1) * pupilLower30kgB;
        milkForDay = (milkForPupil * pupilLower30kgB) / milkInPackage;
        milkForDay = Math.ceil(milkForDay);
        System.out.println("B. Need " + piesForDay + " pies and " + milkForDay + " packages of milk");
    }
}
