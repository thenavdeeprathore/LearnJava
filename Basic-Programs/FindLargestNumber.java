/**
 * @author: Navdeep
 * Find Largest Number
 */
public class FindLargestNumber {

    public static void main(String[] args) {
        largestNumber();
    }

    public static void largestNumber() {
        int a = 1;
        int b = 2;
        int c = 3;
        if (a>b && a>c) {
            System.out.println("a is greater");
        } else if (b>c && b>a) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}