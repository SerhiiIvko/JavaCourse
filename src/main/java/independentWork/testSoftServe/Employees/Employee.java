package independentWork.testSoftServe.Employees;

/**
 * Created by ivko on 06.04.18.
 */
public class Employee extends AbstractCostHolder {


    public Employee(String id, String name, double annualCost) {
        super(id, name);
        this.annualCost = annualCost;
    }

    @Override
    public double getAnnualCost() {
        return annualCost;
    }
}
