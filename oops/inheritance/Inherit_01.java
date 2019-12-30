/**
 * Single level Inheritance
 */
class Parent_01 {

    int a = 10;
    static String s = "Java";

    void m1() {
        System.out.println("Parent non-static method");
        System.out.println(a);
        System.out.println(s);
    }

    static void m2() {
        System.out.println("Parent static method");
        Parent_01 parent = new Parent_01();
        System.out.println(parent.a);
        System.out.println(s);
    }
    
}

class Inherit_01 extends Parent_01 {

    int a = 20;
    static String s = "JavaScript";

    void m3() {
        System.out.println("Child non-static method");
        System.out.println(a);
        System.out.println(s);
    }

    static void m4() {
        System.out.println("Child static method");
        Inherit_01 child = new Inherit_01();
        System.out.println(child.a);
        System.out.println(s);
    }

    void show(int a, String s) {
        // non-static local variable
        System.out.println(a);
        // static local variable
        System.out.println(s);

        // Child Instance variable
        System.out.println(this.a);
        // Child Static variable
        System.out.println(Inherit_01.s);

        // Parent Instance variable
        System.out.println(super.a);
        // Parent Static variable
        System.out.println(Parent_01.s);
    }

    public static void main(String[] args) {
        Parent_01 p1 = new Parent_01();
        p1.m1();
        m2();

        Inherit_01 c1 = new Inherit_01();
        c1.m1();
        m2();
        c1.m3();
        m4();

        c1.show(30, "Python");
    }
    
}