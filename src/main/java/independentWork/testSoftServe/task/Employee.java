package independentWork.testSoftServe.task;

import java.io.*;

public abstract class Employee implements Comparable<Employee>, Serializable {
    private final String name;
    private final int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public abstract double getAverageSalary();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", salary: " + (float) getAverageSalary() +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        if (e == null) return -1;
        int result = -Double.compare(this.getAverageSalary(), e.getAverageSalary());
        if (result == 0) {
            result = this.name.compareToIgnoreCase(e.name);
        }
        return result;
    }
}