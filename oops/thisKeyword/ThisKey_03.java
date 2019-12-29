/**
 * @author: Navdeep
 * this keyword uses:
 * 3) this() can be used to invoke current class constructor.
 */
public class ThisKey_03 {

    ThisKey_03() {
        // this(10);
        System.out.println("no-arg constructor");
    }

    ThisKey_03(int a) {
        this();
        System.out.println("parameterized constructor");
    }
    public static void main(String[] args) {
        new ThisKey_03();
        new ThisKey_03(10);
    }
}