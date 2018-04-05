package classworks.march2018.mar152018.homework.lanaEdition.task2;

public class Event {
    private Object source;
    private DeveloperState state;
    private boolean oldValue;
    private boolean newValue;

    public Event(Object source, DeveloperState state, boolean oldValue, boolean newValue) {
        this.source = source;
        this.state = state;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Object getSource() {
        return source;
    }

    public DeveloperState getState() {
        return state;
    }

    public boolean getOldValue() {
        return oldValue;
    }

    public boolean getNewValue() {
        return newValue;
    }
}