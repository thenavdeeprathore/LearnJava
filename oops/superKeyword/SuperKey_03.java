/**
 * @author: Navdeep
 * Use 3: super() can be used to invoke immediate parent class method.
 */
class B {

    B() {
        System.out.println("Parent class constructor");
    }

}

class SuperKey_03 extends B {

    SuperKey_03() {
        // super(); default
        System.out.println("Child class constructor");
    }
    public static void main(String[] args) {
        new SuperKey_03();
    }
    
}