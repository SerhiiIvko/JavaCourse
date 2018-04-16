package classworks.march2018.mar292018.classwork.task1;

/**
 * Created by ivko on 09.04.18.
 */
public class Student {
    private String name;
    private int year;
    private int rating1;
    private int rating2;
    private int rating3;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
        this.year = 0;
        this.rating1 = 0;
        this.rating2 = 0;
        this.rating3 = 0;
    }

    public Student(String name, int year, int rating1, int rating2, int rating3) {
        this.name = name;
        this.year = year;
        this.rating1 = rating1;
        this.rating2 = rating2;
        this.rating3 = rating3;
    }

    public float averageRating() {
        return (rating1 + rating2 + rating3) / 3;
    }

    public void printStudentInfo() {
        System.out.println(name + "\t" + year + "\t" +
                rating1 + " " + rating2 + " " + rating3 + "\t" + averageRating());
    }

    public void setMarks(int rating1, int rating2, int rating3) {
        this.rating1 = rating1;
        this.rating2 = rating2;
        this.rating3 = rating3;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getRating1() {
        return rating1;
    }

    public int getRating2() {
        return rating2;
    }

    public int getRating3() {
        return rating3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}