package classworks.march2018.mar152018.homework.lanaEdition.task2;

import java.util.Arrays;

public enum DeveloperState {
    BREATH("breath", 0), WORK("work state", 1), ENJOY("enjoy life", 2);

    DeveloperState(String value, int code) {
        this.value = value;
        this.code = code;
    }

    private String value;
    private int code;

    @Override
    public String toString() {
        return value;
    }

    public static DeveloperState getByCode(int code) {
        return Arrays
                .stream(values()).filter(s -> s.code == code)
                .findFirst().orElseThrow(() -> new EnumConstantNotPresentException(DeveloperState.class,
                        String.format("No such code: %d", code)));
    }
}
