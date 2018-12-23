package transmission;

public class Toyota_aygo implements ITransmission {
    @Override
    public String getWillDrive() {
        return "FWD";
    }

    @Override
    public String getTrinsType() {
        return "hand";
    }
}
