package cwtests;

public class StringClassTest3 {
    public static void main(String[] args) {
        String name = "Anton";
        System.out.println(reversString(name));
    }
    static String reversString(String name){
        char[] revStr = name.toCharArray();
        String charName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            charName = charName +  revStr[i];
        }return charName;
    }
}
