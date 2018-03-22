package classworks.mar152018.homework.task0;

public class Developer extends Profession {
    private String speciality;

    public Developer(String name, String industry, String speciality) {
        super(name, industry);
        this.speciality = speciality;
    }

    @Override
    void toWork() {
        System.out.println("Developer write code");
    }

    @Override
    public String toString() {
        return "Developer info:\n" +
                "Name: " + getName() + "\n" +
                "Industry: " + getIndustry() + "\n" +
                "Speciality: '" + speciality + '\'';
    }
}