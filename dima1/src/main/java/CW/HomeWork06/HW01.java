package CW.HomeWork06;

/**
 * Created by D_ma on 20.06.2017.
 */
public class HW01 {
    public static void main(String[] args) {
        System.out.println(calc(1000));

    }

    static int calc(int a) {
        for (int i = 1000; i < 9997; i += 3, a += 3) {
            System.out.println(a);

        }
        return a;
    }

}













