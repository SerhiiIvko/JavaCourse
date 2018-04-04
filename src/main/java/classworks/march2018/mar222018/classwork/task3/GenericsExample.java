package classworks.march2018.mar222018.classwork.task3;

public class GenericsExample<T> {
    T object;

    public GenericsExample(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    void showType() {
        System.out.println("Type of object " + object.getClass().getName());
    }
}
