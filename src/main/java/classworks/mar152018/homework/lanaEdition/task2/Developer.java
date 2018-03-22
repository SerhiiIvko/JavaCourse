package classworks.mar152018.homework.lanaEdition.task2;

/**
 * Created by ivko on 16.03.18.
 */

public interface Developer {
    void writeCode(boolean isWriting);

    void enjoyLife(boolean isEnjoyng);

    void setDeveloperListener(DeveloperListener developerListener);

    void changeState(DeveloperState state, boolean value);
}
