package cw_06;

public class SimpleMethods {
    public static void main(String[] args) {
        String name = "Dima";
        greeting(name);
        greeting("Anton");

        greeting("Valentin", 10);

        greeting("Dima", 5);

        int d = calcD(2, 4, 6);

        System.out.println(d);

        System.out.println(calcD(6, 3, 1));

//        System.out.println(greeting("sds"));

    }

    static int calcD(int a, int b, int c) {
        int d = b * b  - 4 * a * c;
        return d;
    }

    static void greeting(String name) {
        System.out.println(name);
    }

    static void greeting(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }
}

