/**
 * @author: Navdeep
 * Factorial Program
 * Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!
 * 4! = 4*3*2*1 = 24 
 * 5! = 5*4*3*2*1 = 120 
 */
public class Factorial {

    public static void main(String[] args) {
        factorial(3);
        factorial(5);
    }

    public static void factorial(int number) {
        int fact = 1;

        for(int i=1; i<=number; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);   
    }
}