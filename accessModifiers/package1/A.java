package package1;

public class A {

	public String publicVariable = "public class - public modifier variable";
	String defaultVariable = "public class - default modifier variable";
	protected String protectedVariable = "public class - protected modifier variable";
	private String privateVariable = "public class - private modifier variable";
	
	public static void main(String[] args) {
		
		// same class
		A a = new A();
		System.out.println(a.publicVariable);
		System.out.println(a.defaultVariable);
		System.out.println(a.protectedVariable);
		System.out.println(a.privateVariable);
		
		// default class
		B b = new B();
		System.out.println(b.publicVariable);
		System.out.println(b.defaultVariable);
		System.out.println(b.protectedVariable);
//		System.out.println(b.privateVariable); // The field B.privateVariable is not visible

	}

}
