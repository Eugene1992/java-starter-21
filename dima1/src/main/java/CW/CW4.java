package CW;

/**
 * Created by D_ma on 19.06.2017.
 */
public class CW4 {
    public static void main(String[] args) {
        System.out.println(calc(1, 5));
    }

    static int calc(int a, int b) {
        int sum = 0;
        int i;
        for (i = a; i < b; i++) {
            sum += i;
        }
        return sum;
    }
}

