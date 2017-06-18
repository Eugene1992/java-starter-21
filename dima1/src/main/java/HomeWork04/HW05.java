package HomeWork04;

/**
 * Created by D_ma on 18.06.2017.
 */
public class HW05 {
    public static void main(String[] args) {
        long a = 1;
        long b = 1;
        while (a < 9999999) {
            System.out.println(a);
            System.out.println(b);
            a = a + b;
            b = a + b;

        }
    }
}
