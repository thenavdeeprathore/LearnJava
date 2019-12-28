/**
 * @author : Navdeep
 * Method Overloading Case 7:
 * multiple arguments in methods automatic promotion
 */

public class Overloading_08 {

    static void show(int a, float b){
        System.out.println("int float method");
    }

    static void show(float a, int b){
        System.out.println("float int method");
    }

    static void show(String a, int b){
        System.out.println("String int method");
    }

    public static void main(String[] args) {
        show(10, 20.5f);
        show(20.5f, 10);
        // show(10, 20);    //Ambiguous CE
        // show(20.5f, 20.5f); Automation promotion from float to int is Invalid
        show("Java", 10);
    }
}