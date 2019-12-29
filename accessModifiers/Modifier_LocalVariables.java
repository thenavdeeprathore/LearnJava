/**
 * @author : Navdeep 
 * Access Modifiers for Local Variables
 * final
 * You can't use any other modifiers except final
 */

public class Modifier_LocalVariables {

    static void m1(){
        int a=10;       // it's final by default
        final int b=10;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        m1();
    }
}