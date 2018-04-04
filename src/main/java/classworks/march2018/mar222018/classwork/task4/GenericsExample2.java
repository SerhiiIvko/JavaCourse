package classworks.march2018.mar222018.classwork.task4;

public class GenericsExample2<T, V> {
    private T object1;
    private V object2;

    public GenericsExample2(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    void showTypes() {
        System.out.println("Type of first object T " + object1.getClass().getName());
        System.out.println("Type of second object V " + object2.getClass().getName());
    }

    public T getObject1() {
        return object1;
    }

    public V getObject2() {
        return object2;
    }
}