package classworks.feb222018.homework.part2.task2;

import java.util.Arrays;

/**
 * Многомерные массивы
 * В двумерном массиве хранится информация о количестве студентов в той или иной группе каждого курса института с первого
 * по пятый (в первой строке – информация о группах первого курса, во второй – второго и т.д.) На каждом курсе имеется 8
 * групп. Определить среднее число студентов в одной группе. (Сделаете вы с методом или без – решать Вам, в первую очередь
 * это задачи на повторение)
 */
public class DoubleRangeArray {
    public static void main(String[] args) {
        int courseCount = 5;
        int groupCount = 8;
        int[][] array = new int[courseCount][groupCount];
        for (int i = 0; i < courseCount; i++) {
            for (int j = 0; j < groupCount; j++) {
                array[i][j] = (int) (7 + Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Average count of students in groups = " + averageCountOfStudents(array, courseCount, groupCount));
    }

    public static int averageCountOfStudents(int[][] array, int courseCount, int groupCount) {
        int count = 0;
        for (int i = 0; i < courseCount; i++) {
            for (int j = 0; j < groupCount; j++) {
                count = count + array[i][j];
            }
        }
        return Math.round(count / (courseCount * groupCount));
    }
}