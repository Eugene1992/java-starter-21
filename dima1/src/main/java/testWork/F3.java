package testWork;

/**
 * Created by D_ma on 24.06.2017.
 */
public class F3 {
    public static void main(String[] args) {
        int arrey [] ={132,256,378,412,545,665};
        half(arrey);


    }
    static void half (int arrey []){
        for (int i = 0; i < arrey.length / 2; i++) {
            System.out.println("halfOne " + arrey[i]);

        }
        for (int i = arrey.length / 2; i < arrey.length ; i++) {
            System.out.println("           halfTwo " + arrey [i]);

        }
    }

}
