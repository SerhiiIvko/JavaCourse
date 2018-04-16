package independentWork.testSoftServe.Employees;

/**
 * Created by ivko on 06.04.18.
 */
public abstract class AbstractCostHolder {
    private String id;
    private String name;
    protected double annualCost;

    public AbstractCostHolder(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract double getAnnualCost();
}
