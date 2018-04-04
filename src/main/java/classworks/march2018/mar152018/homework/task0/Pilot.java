package classworks.march2018.mar152018.homework.task0;

public class Pilot extends Profession {
    private String planeType;

    public Pilot(String name, String industry, String planeType) {
        super(name, industry);
        this.planeType = planeType;
    }

    @Override
    void toWork() {
        System.out.println("Pilot flying on the aircraft");
    }

    @Override
    public String toString() {
        return "Pilot info:\n" +
                "Name: " + getName() + "\n" +
                "Industry: " + getIndustry() + "\n" +
                "Plane type: '" + planeType + '\'';
    }
}