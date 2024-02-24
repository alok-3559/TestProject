package testABCD;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {
		
		int number,ld=0,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		number = sc.nextInt();
		int num = number;

		
        while(number>0) {
        	ld=number%10;
        	rev= ld + (rev*10);
        	number=number/10;
        }
        
        System.out.println("originul number = " + num);
        System.out.println("reverse number = " + rev);
        if (num==rev) {
        	System.out.println("number " + num + " is a palindrome");
        } else {
        	System.out.println("number " + num + " is not a palindrome");
        }
           sc.close();
	}

}
