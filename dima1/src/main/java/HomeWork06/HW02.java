package HomeWork06;

/**
 * Created by D_ma on 20.06.2017.
 */
public class HW02 {
    public static void main(String[] args) {
        System.out.println(calc(1));

    }
    static int calc(int a) {
        for (int i = 0; i < 55; i++, a += 2) {
            System.out.println(a);

        }
        return a;
    }

}

