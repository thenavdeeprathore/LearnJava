/**
 * @author: Navdeep
 * this keyword uses:
 * 5) this can be used to pass as an argument in the constructor call.
 */
 class Test {

    Test(ThisKey_05 tk) {
        System.out.println("Test class constructor");
    }
 }

 class ThisKey_05 {

    void m1() {
        new Test(this);
        System.out.println("method m1");
    }
    public static void main(String[] args) {
        // Test obj = new Test(this);
        ThisKey_05 t = new ThisKey_05();
        t.m1();
    }
}