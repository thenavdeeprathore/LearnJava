/**
 * ClassObjects_02
 */
public class ClassObjects_02 {

    {
        System.out.println("default block");
    }

    static {
        System.out.println("static block");
    }

    ClassObjects_02() {
        System.out.println("no-arg constructor");
    }

    public void m1() {
        System.out.println("Non-Static method");
    }

    public static void m2() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        ClassObjects_02 obj = null; // Output is: static block
        // obj.m1();    //Null Pointer exception
        obj.m2();   // // Output is: static method
    }

    /**
     * IMPORTANT POINTS:
     * 
     * We cannot call a non-static method on a reference variable with null value, it will throw NullPointerException.
     * We can call static method with reference variables with null values. Since static methods are bonded using static binding, they won’t throw Null pointer Exception.
     */
}