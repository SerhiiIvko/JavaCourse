package classworks.march2018.mar152018.homework.lanaEdition.task2;

public class JavaDeveloper implements Person, Developer {
    private String name;
    private boolean isBreathing;
    private boolean isWritingCode;
    private boolean isEnjoying;
    private DeveloperListener developerListener;

    public JavaDeveloper(String name) {
        this.name = name;
        this.isBreathing = false;
        this.isWritingCode = false;
    }

    public void changeState(DeveloperState state, boolean value) {
        switch (state) {
            case WORK:
                writeCode(value);
                return;
            case ENJOY:
                enjoyLife(value);
                return;
            case BREATH:
                breath(value);
        }
    }

    public void setDeveloperListener(DeveloperListener developerListener) {
        this.developerListener = developerListener;
    }

    @Override
    public void breath(boolean isBreathing) {
        boolean oldValue = this.isBreathing;
        this.isBreathing = isBreathing;
        fireDeveloperStateChanged(new Event(this, DeveloperState.BREATH, oldValue, this.isBreathing));
        if (!isBreathing && this.isEnjoying) {
            enjoyLife(false);
        }
    }

    @Override
    public void writeCode(boolean isWriting) {
        boolean oldValue = this.isWritingCode;
        this.isWritingCode = isWriting;
        fireDeveloperStateChanged(new Event(this, DeveloperState.WORK, oldValue, this.isWritingCode));
        if (isWriting && isEnjoying) {
            enjoyLife(false);
        }
    }

    @Override
    public void enjoyLife(boolean isEnjoyng) {
        if (!isBreathing) {
            throw new IllegalStateException("I don't breath!!!");
        }
        if (isWritingCode) {
            throw new IllegalStateException("I'm busy!!!");
        }
        boolean oldValue = this.isEnjoying;
        this.isEnjoying = isEnjoyng;
        fireDeveloperStateChanged(new Event(this, DeveloperState.ENJOY, oldValue, this.isEnjoying));
    }

    private void fireDeveloperStateChanged(Event event) {
        if (event.getOldValue() != event.getNewValue()) {
            developerListener.stateChanged(event);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.name;
    }
}