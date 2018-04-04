package independentWork.testSoftServe.task;

public class EmployeeHourWage extends Employee {
    private double hourlyRange;

    public EmployeeHourWage(int id, String name, double hourlyRange) {
        super(id, name);
        this.hourlyRange = hourlyRange;
    }

    @Override
    public double getAverageSalary() {
        return 20.8 * 8 * hourlyRange;
    }
}