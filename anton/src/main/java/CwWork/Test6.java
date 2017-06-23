package CwWork;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {

        int[] array = {42, 6654, 643, 754, -456, 653};
        System.out.println(Arrays.toString(array));
        biggest(array);
        System.out.println(Arrays.toString(array));
    }
    static void biggest(int[] array){
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max ){
                max = array[i];
                index = i;
            }
        }
        array[index] = 666;
    }
}
