package homework.head;

public class IHeadImpl implements IHead {
    private String lookStrangeAction;
    private String turnLeftAction;
    private String turnRightAction;

    @Override
    public String lookStrange() {
        lookStrangeAction = "Look strange";
        return lookStrangeAction;
    }

    @Override
    public String turnLeft() {
        turnLeftAction = "Turn left";
        return turnLeftAction;
    }

    @Override
    public String turnRight() {
        turnRightAction = "Turn right";
        return turnRightAction;
    }
}