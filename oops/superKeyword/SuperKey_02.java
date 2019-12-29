/**
 * @author: Navdeep
 * Use 2: used to invoke immediate parent class method.
 */
class A {

    void m1() {
        System.out.println("A class m1 method");
    }

}

class SuperKey_02 extends A {

    void m1() {
        System.out.println("SuperKey_02 class m1 method");
    }

    void show() {
        m1();
        super.m1();
    }
    public static void main(String[] args) {
        SuperKey_02 obj = new SuperKey_02();
        obj.show();
    }
}