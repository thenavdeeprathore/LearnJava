/**
 * @author : Navdeep 
 * Access Modifiers for Methods
 */

public class Modifier_Methods {

    /*
    NOTE: m1() is Compile time error
 	1. void m1()
 	2. public void m1()
 	3. private void m1()
 	4. protected void m1()
 	5. final void m1()
 	6. static void m1()
 	7. static final void m1()
 	8. public static final void m1()
 	9. public static final synchronized void m1()
 	10. public static final synchronized strictfp void m1()
    */

    public static final synchronized strictfp void m1() {
		 System.out.println("method m1()");
    }
    
    public static void main(String[] args) {
        m1();
    }
}