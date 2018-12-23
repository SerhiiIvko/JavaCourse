package homework.robot;

import homework.hand.IHand;
import homework.hand.IHandImpl;
import homework.head.IHead;
import homework.head.IHeadImpl;
import homework.leg.ILeg;
import homework.leg.ILegImpl;

public class IRobotImplR2D2 implements IRobot {
    private String name;
    private IHead head = new IHeadImpl();
    private IHand hand = new IHandImpl();
    private ILeg leg = new ILegImpl();

    @Override
    public String getName() {
        name = "R2D2";
        return name;
    }

    @Override
    public String toString() {
        return "Robot name: " + getName()
                + ".\nRobot actions:\n" +
                "" + head.lookStrange()
                + ", " + hand.takeObject()
                + ", " + leg.stepStrange()
                + ", " + leg.stop();
    }
}