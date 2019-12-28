/**
 * @author : Navdeep
 * Method Overloading Case 8:
 * var arg methods - allows the method to accepts zero or multiple arguments
 */

public class Overloading_09 {

    static void show(int a){
        System.out.println("int method");
    }

    static void show(int... a){
        System.out.println("int... var arg method");
    }

    public static void main(String[] args) {
        show(10);
        show();
        show(10, 20);
        show(10, 20, 30);
    }
}