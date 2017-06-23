package homework07;

/**
 * Created by D_ma on 23.06.2017.
 */
public class HW13 {
    public static void main(String[] args) {
        int [] x = {4, 5, -6, 9, -5};
        System.out.println(suma(x));
    }
    static int suma (int [] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                sum = x[i] + sum;
            }

        }
        return sum;
    }
}
