package CwWork;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {46, 436, 245, 56564, 0, 543, 54, 32};
        nums(array);
    }
    static void nums(int[]array){
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 0){
                break;
            } else {
                System.out.println(array[i]);
            }

        }

    }
}
