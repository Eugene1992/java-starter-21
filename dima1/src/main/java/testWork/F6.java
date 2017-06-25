package testWork;

/**
 * Created by D_ma on 25.06.2017.
 */
public class F6 {
    public static void main(String[] args) {
        double arrey [] = {3, 8, 5, 7, 9, 12, 56, 40};
        average(arrey);

    }
    static void average (double arrey []) {
        double sum = 0;
        for (int i = 0; i < arrey.length ; i++) {
            sum = sum + arrey[i];
            if ( i == arrey.length -1 ) {
                double x = i;
                double b = sum / (i+1);
                System.out.println(b);
            }
        }
    }
}
