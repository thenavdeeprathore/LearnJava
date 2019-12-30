/**
 * @author: Navdeep
 * Power Of N
 * 5^2 = (5*5) = 25
 * 10^2 = (10*10) = 100
 */
public class PowerOfNumber {

    public static void main(String[] args) {
        usingMathFunction(10);
        usingWhileLoop(5);
    }

    public static void usingMathFunction(int number) {
        int p = 2;
        double result = Math.pow(number, p);
        System.out.println(number + "^" + p + " = " + result);
    }

    public static void usingWhileLoop(int number) {
        int p = 2;
        long result = 1;

        int i = p;
        while (i != 0) {
            result *= number;
            --i;
        }
        System.out.println(number + "^" + p + " = " + result);
    }
}