package classworks.dec282017.ternar.task2;

/**
 * 2.Записать условие, которое является истинным, когда
 * a.каждое из чисел X и Y нечетное
 * b.только одно из чисел X и Y меньше 20
 * c.хотя бы одно из чисел X и Y равно нулю
 * d.каждое из чисел X, Y, Z отрицательно
 * e.только одно из чисел X, Y и Z кратно 5
 * f.хотя бы одно из чисел X, Y, Z больше 100
 */
public class Boolean2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z = 1;
        System.out.println(x % 2 == 0 && y % 2 == 0 ? "true" : "false");
        System.out.println(x < 20 || y < 20 ? "true" : "false");
        System.out.println(x == 0 || y == 0 ? "true" : "false");
        System.out.println(x < 0 && y < 0 && z < 0 ? "true" : "false");
        System.out.println(x % 5 == 0 || y % 5 == 0 || z % 5 == 0 ? "true" : "false");
        System.out.println(x > 100 || y > 100 || z > 100 ? "true" : "false");
    }
}
