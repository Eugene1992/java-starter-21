package CwWork;

public class Test2 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
        myArray(array);
        System.out.println();
        myArray2(array);
    }
    static void myArray (int array[]){
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            System.out.print(array[i] + " ");
        }
    }
    static void myArray2 (int array[]){
        for (int i = array.length / 2 - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
