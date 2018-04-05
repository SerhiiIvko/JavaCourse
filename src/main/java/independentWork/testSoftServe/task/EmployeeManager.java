package independentWork.testSoftServe.task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static final String FILE_NAME = "Employee.dat";
    private List<Employee> employeeList;

    public EmployeeManager() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void writeToFile() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream empl = new ObjectOutputStream(fos);
            empl.writeObject(employeeList);
            System.out.println("File successfully created. New file: " + FILE_NAME);
            empl.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Employee> readFromFile() throws ClassNotFoundException {
        List<Employee> employee = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            employee = (List) ois.readObject();
        } catch (FileNotFoundException c) {
            System.out.println("File not found! Check name and type of file.");
            c.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public void printEmployees() {
        printEmployees(employeeList);
    }

    public void printEmployees(List<Employee> employees) {
        employees.stream().map(Employee::toString).forEach(System.out::println);
    }

    public void printEmployeesId(List<Employee> employees) {
        employees.stream().map(Employee::getId).forEach(System.out::println);
    }

    public void sortEmployees() {
        employeeList.sort(Employee::compareTo);
    }

    public List<Employee> getEmployeesInRange(int start, int end) {
        return employeeList.subList(start, end);
    }

    public int getCount() {
        return employeeList.size();
    }
}