package testWork;

/**
 * Created by D_ma on 25.06.2017.
 */
public class F8 {
    public static void main(String[] args) {
        int arrey [] = {3, -5, 6,4,-76,15, 0,12};
        zero(arrey);

    }
    static void zero (int arrey []){
        for (int i = 0; i < arrey.length ; i++) {
            if (arrey[i] < 0 ) {
                arrey[i] = 0;
            }
            System.out.println(arrey[i]);
        }
    }
}
