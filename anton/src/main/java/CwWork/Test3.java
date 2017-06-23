package CwWork;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, -46, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));
        nums(array);
        System.out.println(Arrays.toString(array));
    }
    static void nums (int[] array){
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < 0){
                array[i] = 0;
            }
 //           System.out.println(array[i]);
        }
    }
}
