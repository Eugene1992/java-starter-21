package HomeWork06;

/**
 * Created by D_ma on 20.06.2017.
 */
public class HW03 {
    public static void main(String[] args) {
        System.out.println(calc(90));
    }
    static int calc(int a) {
        for (int i = 90; i > 0; i -= 5, a -= 5) {
            System.out.println(a);

        }
        return a;
    }

}

