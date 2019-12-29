/**
 * @author: Navdeep
 * this keyword uses:
 * 6) this can be used to return the current class instance from the method.
 */
public class ThisKey_06 {

    ThisKey_06 m1() {
        System.out.println("method m1");
        return this;
    }
    public static void main(String[] args) {
        ThisKey_06 obj = new ThisKey_06();
        obj.m1();
    }
}