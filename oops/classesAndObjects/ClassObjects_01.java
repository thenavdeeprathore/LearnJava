/**
 * @author: Navdeep
 * ClassObjects_01
 */
public class ClassObjects_01 {

    {
        System.out.println("default block");
    }

    static {
        System.out.println("static block");
    }

    ClassObjects_01() {
        System.out.println("no-arg constructor");
    }

    public static void main(String[] args) {
        // Output is: static block
    }
}