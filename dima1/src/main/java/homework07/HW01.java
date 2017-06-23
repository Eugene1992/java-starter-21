package homework07;

/**
 * Created by D_ma on 22.06.2017.
 */
public class HW01 {
    public static void main(String[] args) {
        int[] myArey = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        cl(myArey);


    }

    static void cl(int[] myArey) {
        for (int i = 0; i < myArey.length; i++) {
            if (myArey[i] % 2 == 0) {
                System.out.println(myArey[i]);
            }
        }
    }


}


