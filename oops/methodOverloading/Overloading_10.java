/**
 * @author : Navdeep
 * Method Overloading Case 9:
 * access modifiers
 */

public class Overloading_10 {

    static void show(int a, double d){
		System.out.println("Argument type (int , double)");
	}
	
	public static void show(double d, int a){
		System.out.println("Argument type (double, int)");
	}

	private static void show(double d, double a){
		System.out.println("Argument type (double, double)");
	}
	
	protected static void show(int a, float f){
		System.out.println("Argument type (int , float)");
	}
    public static void main(String[] args) {
        show(3.0,5.0);  // (double, double)
		show(7,5.0);    // (int , double)
		show(7,2.12f);  // (int , float)
    }
}