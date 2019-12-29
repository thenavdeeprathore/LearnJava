/**
 * @author: Navdeep
 * this keyword uses:
 * 2) this keyword can be used to invoke current class method (implicitly).
 */
public class ThisKey_02 {

    public void display() {
       System.out.println("hello");
    }

    public void show() {
        // If you don't use this keyword, compiler automatically adds this keyword while invoking the method.
        display();
        this.display(); // same as display();
    }
    public static void main(String[] args) {
        ThisKey_02 t = new ThisKey_02();
        t.show();
    }
}