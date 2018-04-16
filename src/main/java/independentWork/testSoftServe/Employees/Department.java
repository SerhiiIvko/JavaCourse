package independentWork.testSoftServe.Employees;

/**
 * Created by ivko on 06.04.18.
 */
public class Department extends AbstractCostHolder {

    public Department(String id, String name) {
        super(id, name);
    }

    @Override
    public double getAnnualCost() {
        // Calculate the annual report
        return annualCost;
    }
}
