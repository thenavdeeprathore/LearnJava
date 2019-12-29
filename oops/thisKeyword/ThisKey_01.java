/**
 * @author: Navdeep
 * this keyword is the reference variable that refers to the current object
 * this keyword uses:
 * 1) this keyword can be used to refer current class instance variable.
 */
public class ThisKey_01 {

    int i;

    public void setValues(int i) {
        // i = i;  // 0
        this.i = i;
    }

    public void show() {
        System.out.println(i);
    }
    public static void main(String[] args) {
        ThisKey_01 t = new ThisKey_01();
        t.setValues(10);
        t.show();
    }
}