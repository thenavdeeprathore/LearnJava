/**
 * @author : Navdeep
 * Overloading_01: Method Overloading overview
 * 
 * IMPORTANT POINTS:
 * SAME method names within the SAME class with DIFFERENT arguments
 * a) Number of arguments can be different
 * b) Types of arguments can be different
 * c) Sequence of arguments can be different
 */

public class Overloading_01 {

    void show(){
        System.out.println("No-arg method");
    }

    void show(int i){
        System.out.println("int method");
    }

    void show(String s){
        System.out.println("String method");
    }

    void show(int i, int s){
        System.out.println("int int method");
    }

    void show(int i, String s){
        System.out.println("int String method");
    }

    void show(String s, float f){
        System.out.println("String float method");
    }

    public static void main(String[] args) {
        Overloading_01 obj = new Overloading_01();
        obj.show();
        obj.show(10);
        obj.show("Java");
        obj.show(10, 20);
        obj.show(10, "Hello");
        obj.show("Java", 20.5f);
    }
}