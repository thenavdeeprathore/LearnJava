/**
 * @author : Navdeep
 * Method Overloading Case 1:
 * Can we achieve Method Overloading by changing the return type of method only?
 * Answer: No, because of ambiguity.
 */

public class Overloading_02 {

    void show(int a){
        System.out.println("int method with no return type");
    }

    // String show(int a){
    //     System.out.println("int method with String return type");
    // }
    public static void main(String[] args) {
        Overloading_02 obj = new Overloading_02();
        obj.show(10);
    }
}