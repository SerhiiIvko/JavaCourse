package independentWork.testSoftServe.task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements Comparable<Employee>, Serializable {
    public String name;
    public int id;
    private ArrayList<Employee> employees;

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
        return "Employee {" +
                "name: '" + name + '\'' +
                ", id: " + id +
                ", salary: " + (float) getAverageSalary() +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        return Double.compare(e.getAverageSalary(), this.getAverageSalary());
    }

    public static void writeToFile(List<Employee> employees) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("Employee.dat");
            ObjectOutputStream empl = new ObjectOutputStream(fos);
            empl.writeObject(employees);
            System.out.println("File successfully created. New file: Employee.dat");
            empl.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList readFromFile() throws ClassNotFoundException {
        List employee = new ArrayList<Employee>();
        try {
            FileInputStream fis = new FileInputStream("Employee.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employee = (List) ois.readObject();
        } catch (FileNotFoundException c) {
            System.out.println("File not found! Check name and type of file.");
            c.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (ArrayList) employee;
    }
}