/**
 * @author: Navdeep
 * Armstrong Program
 * Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)  
 * where:  
 * (1*1*1)=1  
 * (5*5*5)=125  
 * (3*3*3)=27  
 * So:  
 * 1+125+27=153 
 */
public class Armstrong {

    public static void main(String[] args) {
        arm(153);
        arm(371);
        arm(123);
    }

    public static void arm(int number) {
        int sum=0;
        int rem;
        int temp=number;
        while (number>0) {
            rem = number%10;
            sum = sum + (rem*rem*rem);
            number = number/10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}