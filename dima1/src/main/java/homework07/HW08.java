package homework07;

/**
 * Created by D_ma on 23.06.2017.
 */
public class HW08 {
    public static void main(String[] args) {
        int a[] = {-3, -2, -1, 0, 1, 2};
        cl(a);
    }

    static void cl(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = 0;
                System.out.println(a[i]);


            }

        }
    }
}
