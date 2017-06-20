package HomeWork06;

/**
 * Created by D_ma on 20.06.2017.
 */
public class HW05 {
    public static void main(String[] args) {
        calc(0, 1);

    }

    static void calc(int a, int b) {
        while (a < 99999999) {
            System.out.println(a);
            System.out.println(b);
            a = a + b;
            b = a + b;
        }
    }
}







