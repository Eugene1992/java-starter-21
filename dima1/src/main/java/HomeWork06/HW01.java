package HomeWork06;

/**
 * Created by D_ma on 20.06.2017.
 */
public class HW01 {
    public static void main(String[] args) {
        calc(1000, 3, 10000);
        calc(1, 7, 100);
    }

    static void calc(int from, int step, int to) {
        for (int i = from; i < to; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}













