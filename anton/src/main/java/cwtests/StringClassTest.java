package cwtests;

public class StringClassTest {
    public static void main(String[] args) {
        String name = "Hello, my name is Anton";
        stringName(name);

    }
    static void stringName (String name){
        char[] myName = name.toCharArray();
        for (int i = 0; i < myName.length; i++) {
            System.out.print(myName[i] + " ");
        }
    }
}
