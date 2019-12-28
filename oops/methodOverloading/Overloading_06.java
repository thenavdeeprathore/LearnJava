/**
 * @author : Navdeep
 * Method Overloading Case 5:
 * null method
 */

public class Overloading_06 {

    void show(){
        System.out.println("No-argument method");
    }

    void show(Object o){
        System.out.println("Object method");
    }

    void show(String s){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Overloading_06 obj = new Overloading_06();
        obj.show(null); //String method
    }
}