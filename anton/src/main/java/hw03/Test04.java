package hw03;
public class Test04 {
    public static void main(String[] args) {
        for (int i = 0, j = 2; i < 20; i++, j = j + j++) {
            System.out.println(j);
        }
    }
}
