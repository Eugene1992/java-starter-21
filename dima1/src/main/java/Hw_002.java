/**
 * Created by D_ma on 10.06.2017.
 */
public class Hw_002 {
    public static void main(String[] args) {
        byte b = 30;
        short s = 15000;
        int I = 4000000;
        long L = 67000000000L;

        byte t_sum = 15 + 11;
        System.out.println(t_sum);
        short t_vich = 300 - 199;
        System.out.println(t_vich);
        int t_del = 10 / 2;
        System.out.println(t_del);
        long t_x = 1000 * 1000;
        System.out.println(t_x);
        byte b1 = 16;
        byte b2 = 17;
        byte b12 = (byte) (b1 + b2);
        System.out.println(b12);
        byte b3 = 20;
        short sh1 = 200;
        short seven1 = (short) (sh1 / b3);
        short sh2 = 300;
        short seven2 = (short) (sh2 / b3);
        byte sevensum = (byte) (seven1 + seven2);
        System.out.println(sevensum);
    }
}
