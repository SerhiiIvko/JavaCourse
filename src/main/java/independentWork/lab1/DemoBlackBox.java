package independentWork.lab1;

import java.util.HashMap;
import java.util.Map;

public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);
        BlackBox object3 = new BlackBox(5, 10);

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        Map<String, String> map = new HashMap<>();
//        System.out.println(object1.hashCode());
//        System.out.println(object2.hashCode());
//        System.out.println(object3.hashCode());
//
        boolean isObjectsEquals = object1.equals(object3);// должно быть true
        boolean isHashCodeEqual = object1.hashCode() == object3.hashCode();// должно быть true

        boolean isStringsEquals = str1.equals(str2);// должно быть true
        boolean isHashCodeStringsEqual = str1.hashCode() == str2.hashCode();// должно быть true

        System.out.println("isObjectsEquals = " + isObjectsEquals + ", isHashCodeEqual = " + isHashCodeEqual);
        System.out.println();
        System.out.println("isStringsEquals = " + isStringsEquals + ", isHashCodeStringsEqual = " + isHashCodeStringsEqual);


        //        input:
        //[
        //[sku: “beer1”, cell: 1, quantity: 3], [sku: “beer2”, cell: 0.5, quantity: 2], [sku: “beer3”, cell:
        //        1, quantity: 1]
        //]
        //        result:
        //[
        //[boxPack: 6,
        //                content: [[name: “beer1”, quantity: 3], [name: “beer2”, quantity: 2], [name: “beer3”,
        //        quantity: 1]]
        //]
        //]
    }
}