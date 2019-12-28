/**
 * @author : Navdeep
 * Method Overloading Case 4:
 * Automatic promotion - One type is promoted to another implicitly if no matching data type is found.
 * byte --> short
 * short --> int
 * char --> int
 * int --> {long, float, double}
 * long --> {float, double}
 * float --> double
 * double
 */

public class Overloading_04 {

    void show(Object o){
        System.out.println("Object method");
    }

    void show(int a){
        System.out.println("int method");
    }

    void show(String s){
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Overloading_04 obj = new Overloading_04();
        obj.show('a');  //Automatic promotion - char to int
    }

    /**
     * IMPORTANT POINT:
     * While resolving Overloaded methods, Compiler will always give precedence for the child type argument than compared with parent type argument.
     */
}