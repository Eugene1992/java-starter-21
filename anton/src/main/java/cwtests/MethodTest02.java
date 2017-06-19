package cwtests;

public class MethodTest02 {
    public static void main(String[] args) {
        System.out.println(suma(1, 5));
    }
    static int suma(int start, int end){
        int suma = 0;
        for (int i = start; i <= end ; i++) {
            suma += i;

        }return suma;
    }
}
