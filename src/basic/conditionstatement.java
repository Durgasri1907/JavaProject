package basic;

import java.util.Scanner;

public class conditionstatement {
	
	public static void main(String[] args) {
		System.out.println("the even numbers:");
		for (int i=0; i<=28; i++) {
			if (i%2==0) {
			System.out.println(i);
		}
	}

		// if else statement

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mark:");
		int mark = scanner.nextInt();
		if (mark <= 10) {
			System.out.println("fail");
		} else {
			System.out.println("pass");

		}
		
		
		
		
		
		
		
		
		
		
	
		
		

	}
}

