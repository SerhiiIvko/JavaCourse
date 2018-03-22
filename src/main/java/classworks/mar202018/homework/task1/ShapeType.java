package classworks.mar202018.homework.task1;

public enum ShapeType {
    BLOCK(1),
    SPHERE(2),
    PYRAMID(3);

    ShapeType(int code) {
        this.code = code;
    }

    public static ShapeType getByCode(int code) {
        for (int i = 0; i < values().length; i++) {
            if (code == values()[i].code) {
                return values()[i];
            }
        }
        throw new IllegalArgumentException();
    }

    int code;
}