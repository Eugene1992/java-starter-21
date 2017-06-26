package cwtests;

public class StringClassTest2 {
    public static void main(String[] args) {
        String charNum = "Hello World!";
        int num = 4;
        System.out.println(arrayNumToString(charNum,num));

    }
    static char arrayNumToString(String charNum, int num){
        char[] numToArray = charNum.toCharArray();
        return numToArray[num];


    }

}
