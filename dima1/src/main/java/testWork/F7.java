package testWork;

/**
 * Created by D_ma on 25.06.2017.
 */
public class F7 {
    public static void main(String[] args) {
        int arrey [] = {34, 17,74, 85, 0, -48, -100, 176, 1};
        minmax(arrey);

    }
    static void minmax (int arrey []) {
        int xMax = 1;
        for (int i = 0; i < arrey.length; i++) {
            if (xMax < arrey[i]) {
                xMax = arrey [i];
            }
        }
        int xMin = 1;
        for (int i = 0; i < arrey.length; i++) {
            if (xMin > arrey[i]) {
                xMin = arrey[i];
            }
        }
        System.out.println(xMax);
        System.out.println(xMin);
    }
}
