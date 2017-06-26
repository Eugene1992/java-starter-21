package HwTests;

public class Array01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        integer(array);
        System.out.println();
        intReverse(array);
        System.out.println();
        intReverse2(array);
        System.out.println();
        middle(array);
        System.out.println();
    }
    static void integer(int[] array){
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
    static void intReverse(int[] array){
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            System.out.print(array[i] + " ");
        }
    }
    static void intReverse2(int[] array){
        for (int i = array.length / 2 - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
    static int middle(int[] array){
        int sum = 0;
        int arrLength = 0;
        for (int i = 0; i < array.length ; i++) {
            sum = array[i] + sum;
            arrLength = array.length;



        }return sum;

    }
}
