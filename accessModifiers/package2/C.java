package package2;

import package1.*;

public class C {

	public static void main(String[] args) {

		// public class
		A a = new A();
		System.out.println(a.publicVariable);

		// default class
		
		// change visibility of B class to public 
		
//		B b = new B();
//		System.out.println(b.publicVariable);
	}

}
