/**
 * @author: Navdeep
 * this keyword uses:
 * 4) this can be used to pass as an argument in the method call.
 */
public class ThisKey_04 {

    void m1(ThisKey_04 tk) {
        System.out.println("method m1");
    }

    void m2() {
        m1(this);
        System.out.println("method m2");
    }
    public static void main(String[] args) {
        ThisKey_04 obj = new ThisKey_04();
        obj.m2();
    }
}