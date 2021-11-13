package basicProgramSet1;

import java.util.Scanner;

// Java Program to Print an Integer (Entered by the User)

public class P_01 {

	void readNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Number entered by the user is: "+num);
		sc.close();
	}
	
	public static void main(String[] args) {
		P_01 obj = new P_01();
		obj.readNumber();
	}

}
