/**
 * @author: Navdeep
 * Fibonacci Program
 * In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
 */
public class Fibonacci {

    public static void main(String[] args) {
        fib();
    }

    public static void fib() {
        int n1=0,n2=1,n3,count=10;

        System.out.print(n1+" "+n2);//printing 0 and 1    
           
        for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }  
    }
}