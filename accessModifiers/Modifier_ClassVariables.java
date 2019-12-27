/**
 * @author : Navdeep 
 * Access Modifiers for Class Variables {instance and static variables}
 */

public class Modifier_ClassVariables {

    /*
     * 1. default 
     * 2. public 
     * 3. private 
     * 4. protected
     * 
     * NOTE: The field a can only set one of public / protected / private
     * 
     * 5. static 
     * 6. final 
     * 7. public static
     * 
     * NOTE: Can't have static and final both in Class variable.
     */

     int a;
     public int b;
     private int c;
     protected int d;
     static int e;
     final int f=10;
     public static int g;

     void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
     }
    public static void main(String[] args) {
        Modifier_ClassVariables obj = new Modifier_ClassVariables();
        obj.show();
    }
}