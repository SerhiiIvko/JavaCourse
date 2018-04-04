package independentWork.testSoftServe.task;

public class EmployeeFixedPayment extends Employee {
    private double fixedPayment;

    public EmployeeFixedPayment(int id, String name, double fixedPayment) {
        super(id, name);
        this.fixedPayment = fixedPayment;
    }

    @Override
    public double getAverageSalary() {
        return fixedPayment;
    }
}