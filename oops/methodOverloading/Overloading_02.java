/**
 * @author : Navdeep
 * Overloading_02: Case 1 - null Test
 */

public class Overloading_02 {

    void show(Object o){
        System.out.println("Object method");
    }

    void show(String s){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Overloading_02 obj = new Overloading_02();
        obj.show(10);
        obj.show("Hello");
        obj.show(null);
    }
}