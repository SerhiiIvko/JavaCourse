package classworks.march2018.mar152018.homework.lanaEdition.task2;

public interface Developer {
    void writeCode(boolean isWriting);

    void enjoyLife(boolean isEnjoyng);

    void setDeveloperListener(DeveloperListener developerListener);

    void changeState(DeveloperState state, boolean value);
}