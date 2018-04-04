package classworks.march2018.mar202018.homework.task2;

public class Group {
    private Student[] student;

    Group(Student[] student) {
        this.student = student;
    }

    String printGroupInfo() {
        StringBuilder sb = new StringBuilder();
        for (Student aStudent : student) {
            sb.append(aStudent.toString()).append("\n");
        }
        return sb.toString();
    }
}