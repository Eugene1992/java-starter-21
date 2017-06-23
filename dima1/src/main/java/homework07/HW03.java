package homework07;

/**
 * Created by D_ma on 22.06.2017.
 */
public class HW03 {
    public static void main(String[] args) {
        int[] arey = {1, 2, 3, 4, 5, 6};
        uh(arey);
        System.out.println("  ");
        System.out.println(arey[3]);
        System.out.println(arey[4]);
        System.out.println(arey[5]);
    }
    static void uh (int [] arey) {
        for (int i = 0; i < arey.length / 2 ; i++) {
            System.out.println(arey[i]);
        }
        for (int i = 0; i > arey.length  ; i++) {
            System.out.println(arey[3]);
            System.out.println(arey[4]);
            System.out.println(arey[5]);

        }

    }
}
