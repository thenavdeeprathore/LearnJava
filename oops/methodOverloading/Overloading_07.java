/**
 * @author : Navdeep
 * Method Overloading Case 6:
 * null method - String vs Object
 */

public class Overloading_07 {

    void show(Object o1, Object o2){
        System.out.println("Object Object method");
    }

    void show(String s, Object o){
        System.out.println("String Object method");
    }

    public static void main(String[] args) {
        Overloading_07 obj = new Overloading_07();
        obj.show(null, null); //String Object method
    }
}