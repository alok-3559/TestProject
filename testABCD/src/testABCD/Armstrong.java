package testABCD;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int t1 = num;
		int leng = 0;
		
		while(t1!=0) {
			leng = leng+1;
			t1=t1/10;	
		}
		sc.close();
		
		int t2 =num;
		int arm = 0;
		int rem = 0;
		
		while(t2!=0) {
			int mul = 1;
			rem =t2%10;
			for (int i =1; i<=leng; i++) {
				
				mul = mul*rem;
			}
			
			arm =arm+mul;
			t2 = t2/10;
				
		}
		
		if (arm ==num) {
			System.out.println(num + " is armstrong");
		} else {
			System.out.println(num + " is not armstrong");
		}


	}

}
