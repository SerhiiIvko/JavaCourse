package classworks.march2018.mar152018.homework.task2;

/**
 * Создайте интерфейс Developer с методами «писать код» и «наслаждаться жизнью», и интерфейс Human с методом «дышать».
 * В классе JavaDeveloper с приватным параметром «Имя» нужно реализовать методы эти двух интерфейсов. То же самое сделать
 * и в классе CppDeveloper.
 * В классе DeveloperRunner создайте экземпляры разработчиков, в конструкторе дайте им имена и выведете результат работы
 * реализованных методов на консоль.
 * Так же во всех классах где необходимо должны быть созданы методы для работы с параметрами и организован вывод данных (toString).
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Bill Gates");
        CppDeveloper cppDeveloper = new CppDeveloper("Steeve Jobs");

        System.out.println(javaDeveloper.toString());
        javaDeveloper.breathe();
        javaDeveloper.writeCode();
        javaDeveloper.enjoyingLife();
        System.out.println();
        System.out.println(cppDeveloper.toString());
        cppDeveloper.breathe();
        cppDeveloper.writeCode();
        cppDeveloper.enjoyingLife();
    }
}