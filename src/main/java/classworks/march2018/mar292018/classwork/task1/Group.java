package classworks.march2018.mar292018.classwork.task1;

/**
 * Created by ivko on 09.04.18.
 */
public class Group {
    private String groupName;
    Student[] students;

    Group() {
        groupName = " ";
        students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void printGroup1() {
        System.out.println(groupName);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + "\t" +
                    students[i].getYear() + "\t" +
                    students[i].getRating1() + "\t" +
                    students[i].getRating2() + "\t" +
                    students[i].getRating3() + " ");
            System.out.println(students[i].averageRating());
        }
    }

    public void printGroup2() {
        System.out.println(groupName);
        for (int i = 0; i < students.length; i++) {
            students[i].printStudentInfo();
        }
    }
}