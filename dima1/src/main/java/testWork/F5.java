package testWork;

/**
 * Created by D_ma on 24.06.2017.
 */
public class F5 {
    public static void main(String[] args) {
        int arrey [] = {2, 5, 10, 15};


        sum(arrey);

    }
    static void sum (int[] arrey ) {
        int suma = 0;
        for (int i = 0; i < arrey.length; i++) {
            suma = suma + arrey[i];
        }
        System.out.println(suma);
    }

}
