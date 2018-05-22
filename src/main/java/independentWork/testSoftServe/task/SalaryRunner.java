package independentWork.testSoftServe.task;

import java.util.List;

/**
 * Create classes, which describe manager with hourly wage and fixed payment. Give your suggestions
 * about relations between classes. Implement method for calculating the average monthly salary. For
 * manager with hourly wage use next formula: “average monthly salary= 20.8*8* hourly rate”, for manager
 * with fixed payment – “average monthly salary= fixed monthly payment”. Write well commented code for
 * solving next problems
 * a) Sort the collection of manager in descending order by the average monthly salary. In the case of
 * equal salary – by the name. Write ID, name and monthly salary for all manager from collection.
 * b) Write information about first five manager from collection (problem a).
 * c) Write ID of three last manager from collection (problem b).
 * d) Write code for reading and writing collection of these objects from (into) file.
 * e) Write code for handling the incorrect format of incoming file.
 */
public class SalaryRunner {
    public static void main(String[] args) throws Exception {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new EmployeeFixedPayment(1, "Ivan", 1000));
        manager.addEmployee(new EmployeeHourWage(2, "Vovan", 15));
        manager.addEmployee(new EmployeeHourWage(3, "Kolyan", 20));
        manager.addEmployee(new EmployeeFixedPayment(4, "Tolyan", 1100));
        manager.addEmployee(new EmployeeFixedPayment(5, "Bill", 2000));
        manager.addEmployee(new EmployeeHourWage(6, "Steeve", 18));

        manager.printEmployees();
        manager.sortEmployees();
        manager.printEmployees();

        manager.printEmployees(manager.getEmployeesInRange(0, 5));
        manager.printEmployeesId(manager.getEmployeesInRange(manager.getCount() - 3, manager.getCount()));

        manager.writeToFile();
        List<Employee> employees = manager.readFromFile();
    }
}