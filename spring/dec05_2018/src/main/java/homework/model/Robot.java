package homework.model;

import java.util.Objects;

public class Robot {
    private int id;
    private String name;
    private String model;

    public Robot() {
    }

    public Robot(int id, String name, String model) {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Robot)) return false;
        Robot robot = (Robot) o;
        return getId() == robot.getId() &&
                getName().equals(robot.getName()) &&
                getModel().equals(robot.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getModel());
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}