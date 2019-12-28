/**
 * @author : Navdeep
 * Overloading_01: Method Overloading overview
 */

public class Overloading_01 {

    void show(){
        System.out.println("No-arg method");
    }

    void show(String s){
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Overloading_01 obj = new Overloading_01();
        obj.show("Java");
        obj.show();
    }
}