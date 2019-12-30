/**
 * @author: Navdeep
 * Palindrome Program
 * A palindrome number is a number that is same after reverse. 
 * For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
 * It can also be a string like LOL, MADAM etc
 */
public class Palindrome {

    public static void main(String[] args) {
        palindrome(151);
        palindrome(545);
        palindrome(123);
    }

    public static void palindrome(int number) {
        int sum=0;
        int rem;
        int temp=number;
        while (number>0) {
            rem = number%10;
            sum = (sum*10)+rem;
            number = number/10;
        }
        if(temp==sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}