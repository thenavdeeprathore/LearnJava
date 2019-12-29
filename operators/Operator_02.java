/**
 * @author: Navdeep
 * Unary Operator: postfix and prefix
 */

public class Operator_02 {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++);    // 10 (11)
        System.out.println(++x);    // 12
        System.out.println(x--);    // 12 (11)
        System.out.println(--x);    // 10

        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);  // 10 (11) + 12 = 22
        System.out.println(b++ + b++);  // 10 (11) + 11 (12) = 21
        
        int i = 0;
        System.out.println(i++ +i);     // 0 (1) + 1 = 1

        int m = 10;
        int n = -10;
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(~m);     // -11 (minus of total positive value which starts from 0)
        System.out.println(~n);     // 9 (positive of total minus, positive starts from 0)
        System.out.println(!b1);    // false
        System.out.println(!b2);    // true

    }
}