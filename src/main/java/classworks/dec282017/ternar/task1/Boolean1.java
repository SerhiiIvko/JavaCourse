package classworks.dec282017.ternar.task1;

/**
 * 1.Вычислить значения логического выражения при следующих значениях логических величин А, В, и С: А = Истина, В = Ложь,
 * С = Ложь.
 * a.А или В и не С
 * b.не А и не В
 * c.не (А и С) или В
 * d.А и не В или С
 * e.А и (не В или С)
 * f.А или (не (В и С))
 */
public class Boolean1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println(a || b && !c ? "true" : "false");
        System.out.println(!a && !b ? "true" : "false");
        System.out.println(!(a && c) || b ? "true" : "false");
        System.out.println(a && !b || c ? "true" : "false");
        System.out.println(a && (!b || c) ? "true" : "false");
        System.out.println(a || (!(b && c)) ? "true" : "false");
    }
}
