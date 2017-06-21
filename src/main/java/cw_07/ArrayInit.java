package cw_07;

public class ArrayInit {
    public static void main(String[] args) {
        int[] ints = new int[3];
        System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[2]);

        ints[0] = 7;
        System.out.println(ints[0]);

        int ints1[] = new int[3]; // C++ style
        int[] ints2 = new int[]{1, 5, 6};

        System.out.println(ints2[0]);
        System.out.println(ints2[1]);
        System.out.println(ints2[2]);

        int ints3[] = {1, 5, 6};
        System.out.println(ints3[0]);
        System.out.println(ints3[1]);
        System.out.println(ints3[2]);
    }
}
