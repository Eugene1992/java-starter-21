package homework07;

/**
 * Created by D_ma on 23.06.2017.
 */
public class HW04 {
    public static void main(String[] args) {
        int[] myArey = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        cl(myArey);
        cll(myArey);
    }

    static void cl(int[] myArey) {
        for (int i = myArey.length - 1; i >= myArey.length / 2; i--) {
            System.out.println(myArey[i]);

        }
    }

    static void cll(int[] myArey) {
        for (int i = myArey.length / 2 ; i >= 0; i--) {
            System.out.println(myArey[i]);

        }

    }
}
