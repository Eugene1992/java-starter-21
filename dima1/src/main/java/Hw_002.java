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
        short vos1 = 30;
        short vos2 = 10;
        short vos1vos2 = (short) (vos1 / vos2);
        System.out.println(vos1vos2);
        byte vosb1 = 40;
        byte vosb2 = 4;
        byte vosb1vosb2 = (byte) (vosb1 / vosb2);
        System.out.println(vosb1vosb2);
        int vosem = vos1vos2 * vosb1vosb2;
        System.out.println(vosem);
        int m1 = 20;
        int m2 = 5;
        int m3 = 19;
        m1 = m3;
        m2 = m3;
        System.out.println(m1);
        System.out.println(m2);
        int k1 = 36;
        int k2 = 40;
        k1 = 15;
        k2 = 15;
        System.out.println(k1);
        System.out.println(k2);
    }
}
