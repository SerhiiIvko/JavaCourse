package classworks.mar062018.classwork.task5;

public class Constructor {
    int sum;

    Constructor(int number) {
        sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
    }

    Constructor(Constructor object) {
        sum = object.sum;
    }
}