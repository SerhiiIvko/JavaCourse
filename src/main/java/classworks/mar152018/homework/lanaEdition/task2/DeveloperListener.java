package classworks.mar152018.homework.lanaEdition.task2;

/**
 * Created by ivko on 16.03.18.
 */
public class DeveloperListener {

    synchronized public void stateChanged(Event event) {
        Object source = event.getSource();
        DeveloperState state = event.getState();
        boolean oldValue = event.getOldValue();
        boolean newValue = event.getNewValue();
        System.out.println(String.format("%s changed his %s from %s to %s",
                source.toString(), state, oldValue, newValue));
    }
}
