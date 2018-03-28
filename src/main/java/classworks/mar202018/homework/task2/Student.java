package classworks.mar202018.homework.task2;

import java.util.Arrays;

public class Student {
    private int id;
    private int yearBorn;
    private String name;
    private int[] appraisal;

    Student(int id, int yearBorn, String name, int... appraisal) {
        this.id = id;
        this.yearBorn = yearBorn;
        this.name = name;
        this.appraisal = appraisal;
    }

    double getAverageRating() {
        double sum = 0;
        for (int anAppraisal : appraisal) {
            sum += anAppraisal;
        }
        return (float) sum / appraisal.length;
    }

    @Override
    public String toString() {
        return "Student " + id + " info: " +
                "Year born: " + yearBorn + ", " +
                "Name: " + name + ", " +
                "Appraisals = " + Arrays.toString(appraisal) + ", " +
                "Average rating = " + Math.round(getAverageRating()) + "\n";
    }
}