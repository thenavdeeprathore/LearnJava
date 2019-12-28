/**
 * @author : Navdeep
 * Method Overloading Case 4:
 * Automatic promotion with same class level - String vs StringBuffer vs StringBuilder
 */

public class Overloading_05 {

    void show(StringBuffer sb){
        System.out.println("StringBuffer method");
    }

    void show(StringBuilder sb){
        System.out.println("StringBuilder method");
    }

    void show(String s){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Overloading_05 obj = new Overloading_05();
        obj.show("Java");
        obj.show(new StringBuffer("Python"));
        obj.show(new StringBuilder("JavaScript"));
        // obj.show(null); // Compile time error - ambiguous
    }
}