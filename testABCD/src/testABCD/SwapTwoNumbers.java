package testABCD;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
	    
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("reverse numbers are");
		System.out.println(a);
		System.out.println(b);
		sc.close();
		

	}

}
