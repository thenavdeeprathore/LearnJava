/**
 * ClassObjects_03
 */
public class ClassObjects_03 {

    {
        System.out.println("default block");
    }

    static {
        System.out.println("static block");
    }

    ClassObjects_03() {
        System.out.println("no-arg constructor");
    }

    public void m1() {
        System.out.println("Non-Static method");
    }

    public static void m2() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        ClassObjects_03 obj = new ClassObjects_03();
        // static block
        // default block
        // no-arg constructor
        obj.m1();   // Non-Static method
        m2();   // Static method

    }
}