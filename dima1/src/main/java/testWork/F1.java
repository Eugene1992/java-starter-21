package testWork;

/**
 * Created by D_ma on 23.06.2017.
 */
public class F1 {
    public static void main(String[] args) {
        int [] arrey = {1, 4, 5, 6, 8, 3, 10, 11};
        even(arrey);


    }
    static int even (int [] arrey) {
        for (int i = 0; i < arrey.length ; i++) {
            int z = arrey[i] / 2;
            int z1 = z * 2;
            if (z1 == arrey[i]) {
                System.out.println(arrey[i]);
            }



        }
        return 0;
    }

}










