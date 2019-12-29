/**
 * @author: Navdeep
 * super keyword is a reference variable that is used to refer parent class objects.
 * Use 1: used to refer immediate parent class instance variable.
 * Inheritance is mandatory for super keyword
 */
class Parent {

    int a = 10;

}

class SuperKey_01 extends Parent {

    int a = 20;

    void show(int a) {
        System.out.println(a);          // 30
        System.out.println(this.a);     // 20
        System.out.println(super.a);    //10
    }
    public static void main(String[] args) {
        SuperKey_01 obj = new SuperKey_01();
        obj.show(30);
    }
}