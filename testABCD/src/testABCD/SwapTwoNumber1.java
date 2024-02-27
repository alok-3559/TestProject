package testABCD;

import java.util.Scanner;

public class SwapTwoNumber1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("The numbers are");
		a= sc.nextInt();
		b = sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("swapping numbers are " );
		System.out.println(a);
		System.out.println(b);
		sc.close();

	}

}
