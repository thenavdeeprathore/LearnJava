/**
 * @author : Navdeep
 * Method Overloading Case 2:
 * Can we overload the main method in java?
 * Answer: Yes
 */

public class Overloading_03 {
    public static void main(String[] args) {
        System.out.println("first main method");
        main(10);
    }

    public static void main(int a) {
        System.out.println("second main method");
    }
}