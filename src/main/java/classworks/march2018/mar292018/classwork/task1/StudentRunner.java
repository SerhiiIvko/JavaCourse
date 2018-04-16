package classworks.march2018.mar292018.classwork.task1;

/**
 * Created by ivko on 09.04.18.
 */
public class StudentRunner {
    public static void main(String[] args) {
        Group group = new Group();
        group.setGroupName("KIT-76");
        group.students[0].setName("Ivanov I. I.");
        group.students[0].setYear(1990);
        group.students[0].setMarks(10, 11, 10);
        group.students[1].setName("Petrov P. I.");
        group.students[1].setYear(1991);
        group.students[1].setMarks(9, 9, 10);
        group.students[2].setName("Sidorov I. P.");
        group.students[2].setYear(1992);
        group.students[2].setMarks(8, 9, 9);
        group.students[3].setName("Turov V. I.");
        group.students[3].setYear(1991);
        group.students[3].setMarks(11, 11, 12);
        group.students[4].setName("Volkov L. I.");
        group.students[4].setYear(1991);
        group.students[4].setMarks(12, 11, 10);
        group.printGroup1();
        group.printGroup2();
    }
}