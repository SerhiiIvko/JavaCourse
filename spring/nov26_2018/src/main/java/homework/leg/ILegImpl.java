package homework.leg;

public class ILegImpl implements ILeg {
    private String stepStrangeAction;
    private String stepBackAction;
    private String stop;

    @Override
    public String stepStrange() {
        stepStrangeAction = "Step strange";
        return stepStrangeAction;
    }

    @Override
    public String stepBack() {
        stepBackAction = "Step back";
        return stepBackAction;
    }

    @Override
    public String stop() {
        stop = "Stop";
        return stop;
    }
}