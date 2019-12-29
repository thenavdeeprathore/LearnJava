/**
 * @author: Navdeep
 * Arithmetic Operator: + - * / %
 */

public class Operator_01 {

    public static void add(int num1, int num2) {
        System.out.println("Addition is: "+(num1+num2));
    }

    public static void sub(int num1, int num2) {
        System.out.println("SUbtraction is: "+(num1-num2));
    }

    public static void mul(int num1, int num2) {
        System.out.println("Multiplication is: "+(num1*num2));
    }

    public static void div(int num1, int num2) {
        System.out.println("Division is: "+(num1/num2));
    }

    public static void rem(int num1, int num2) {
        System.out.println("Remainder is: "+(num1%num2));
    }

    public static void main(String[] args) {
        add(2, 2);
        sub(5, 2);
        mul(5, 4);
        div(70, 10);
        rem(55, 10);

        System.out.println(10*10/5+3-1*4/2); 
        // 10*2+3-1*2
        // 20+3-2
        // 21
    }
}