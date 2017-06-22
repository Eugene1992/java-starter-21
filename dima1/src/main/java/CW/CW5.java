package CW;

/**
 * Created by D_ma on 21.06.2017.
 */
public class CW5 {
    public static void main(String[] args) {
        int[] arey = {1, 2, 3, 4, 5};
        mass(arey);
        System.out.println(massTwo(arey));
        System.out.println(massThree(arey));
        System.out.println(massFour(arey));

    }

    static void mass(int[] arey) {
        for (int i = 0; i < arey.length; i++) {
            System.out.println(arey[i]);
        }
    }

    static int massTwo(int[] arey) {
        int s = 0;
        for (int i = 0; i < arey.length; i++) {
            s = arey[i] + s;
        }
        return s;
    }

    static int massThree(int[] arey) {
        int s = arey[0];
        for (int i = 0; i < arey.length; i++) {
            if (s < arey[i]) {
                s = arey[i];

            }

        }
        return s;
    }

    static int massFour(int[] arey) {
        int s = 0;
        for (int i = 2; i < 3; i++) {
            s = arey[i] + s;


        }
        return s;
    }
}
