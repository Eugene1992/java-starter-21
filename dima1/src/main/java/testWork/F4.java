package testWork;

/**
 * Created by D_ma on 24.06.2017.
 */
public class F4 {
    public static void main(String[] args) {
        int arrey [] = {34, 45, 445, 34, 0, 432, 678, 73};
        half(arrey);
    }
    static void half (int arrey []) {
        for (int i = arrey.length - 1 ; i >= arrey.length / 2; i--) {
            System.out.println("halfOne " + arrey[i]);

        }
        for (int i = (arrey.length - 1 ) / 2; i >=  0; i--) {
            System.out.println("          halfTwo " + arrey[i]);
        }
    }
}
// почему  (ст 16) без -1 в "i = " захватывает 0 ?