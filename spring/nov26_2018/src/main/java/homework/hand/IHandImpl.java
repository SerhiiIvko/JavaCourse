package homework.hand;

public class IHandImpl implements IHand {
    private String takeAction;
    private String putAction;
    private String dropAction;

    @Override
    public String takeObject() {
        takeAction = "Take object";
        return takeAction;
    }

    @Override
    public String putObject() {
        putAction = "Put object";
        return putAction;
    }

    @Override
    public String dropObject() {
        dropAction = "Drop object";
        return dropAction;
    }
}