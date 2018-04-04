package independentWork.testSoftServe.task;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create classes, which describe employees with hourly wage and fixed payment. Give your suggestions
 * about relations between classes. Implement method for calculating the average monthly salary. For
 * employees with hourly wage use next formula: “average monthly salary= 20.8*8* hourly rate”, for employees
 * with fixed payment – “average monthly salary= fixed monthly payment”. Write well commented code for
 * solving next problems
 * a) Sort the collection of employees in descending order by the average monthly salary. In the case of
 * equal salary – by the name. Write ID, name and monthly salary for all employees from collection.
 * b) Write information about first five employees from collection (problem a).
 * c) Write ID of three last employees from collection (problem b).
 * d) Write code for reading and writing collection of these objects from (into) file.
 * e) Write code for handling the incorrect format of incoming file.
 */
public class SalaryRunner {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new EmployeeFixedPayment(1, "Ivan", 1000));
        employees.add(new EmployeeHourWage(2, "Vovan", 15));
        employees.add(new EmployeeHourWage(3, "Kolyan", 20));
        employees.add(new EmployeeFixedPayment(4, "Tolyan", 1100));
        employees.add(new EmployeeFixedPayment(5, "Bill", 2000));
        employees.add(new EmployeeHourWage(6, "Steeve", 18));
        employees.stream().map(Employee::toString).forEach(System.out::println);
        employees.sort(Employee::compareTo);
        System.out.println();
        employees.stream().map(Employee::toString).forEach(System.out::println);
        System.out.println();
        employees.subList(0, 5).stream().map(Employee::toString).forEach(System.out::println);
        System.out.println();
        employees.subList(employees.size() - 3, employees.size()).stream().map(Employee::getId).forEach(System.out::println);

        Employee.writeToFile(employees);
        ArrayList<Employee> listEmloyees = Employee.readFromFile();
        listEmloyees.stream().map(Employee::toString).forEach(System.out::println);
    }
}