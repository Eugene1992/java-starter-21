package hw03;
public class Test03 {
    public static void main(String[] args) {
        for(int i = 0, j = 100; i < 21; i++, j -= 4) {
            System.out.println(j);
            j--;
        }
    }
}
