package cwtests;

public class MethodTest {
    public static void main(String[] args) {
       interval(2, 5, 8 );
       interval(10,15,1000);


    }
   static void interval (int start, int step, int end){
      for (int i = start;  i < end; i += step) {
            System.out.println(i);
        }

    }
}
