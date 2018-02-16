package independentWork.work1.methods.task1;

/**
 * Created by ivko on 15.02.18.
 */
public class TipoEnum {


    public static final TipoEnum MONDAY = new TipoEnum(1);
    public static final TipoEnum TUESDAY = new TipoEnum(2);
    public static final TipoEnum WEDNESDAY = new TipoEnum(3);
    public static final TipoEnum THUSDAY = new TipoEnum(4);
    public static final TipoEnum FRIDAY = new TipoEnum(5);
    public static final TipoEnum SATURDAY = new TipoEnum(6);
    public static final TipoEnum SUNDAY = new TipoEnum(7);
    public static final TipoEnum UNDEFINED = new TipoEnum(-1);

    public static TipoEnum[] values = {MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRIDAY, SATURDAY, SUNDAY};

    public static TipoEnum[] values() {
        return values;
    }

    public static TipoEnum getDayByNumber(int numberOfDay) {
        for (TipoEnum day : values()) {
            if (day.numberOfDay == numberOfDay) {
                return day;
            }
        }
        return UNDEFINED;
    }

    private int numberOfDay;

    public TipoEnum(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }


    public static void main(String[] args) {
        System.out.println(TipoEnum.FRIDAY);
    }
}
