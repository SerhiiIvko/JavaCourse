package classworks.march2018.mar022018.classwork.task3;

public class Developer {
    private int id;
    private String firstName;
    private String lastName;
    private String speciality;
    private int experience;
    private double salary;

    public Developer(int id, String firstName, String lastName, String speciality, int experience, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.experience = experience;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    public void writeCode() {
        System.out.println("Developer write code...");
    }

    public void getDepression() {
        System.out.println("Developer is depressing");
    }

    public void solveProblem() {
        System.out.println("Solving problem");
        System.out.println("Problem solved");
    }

    public void enjoyTheLife() {
        System.out.println("Developer is happy and drinking beer");
    }

    @Override
    public String toString() {
        return "Developer" + "\n" +
                "id = " + id + "\n" +
                "firstName='" + firstName + '\'' + "\n" +
                "lastName='" + lastName + '\'' + "\n" +
                "speciality='" + speciality + '\'' + "\n" +
                "experience=" + experience + "\n" +
                "salary=" + salary;
    }
}