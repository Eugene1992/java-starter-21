package testWork;

/**
 * Created by D_ma on 23.06.2017.
 */
public class F2 {
    public static void main(String[] args) {
        int [] arrey = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
        numb(arrey);
    }
    static void numb (int [] arrey) {
        for (int i = arrey.length - 1 ; i >= 0;  i--) {
            System.out.println(arrey[i]);
        }
    }
}
