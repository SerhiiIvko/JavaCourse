package classworks.jan302018.task9;

/**
 * Из слова яблоко путем «вырезок» получить слова блок и око.
 */
public class Apple {
    public static void main(String[] args) {
        String string = "яблоко";
        String apple = string.substring(1, string.length() - 1);
        String eye = string.substring(string.length() / 2, string.length());

        System.out.println(apple);
        System.out.println(eye);
    }
}
