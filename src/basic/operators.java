package basic;

public class operators {
	
	public static void main(String[] args) {
		// arithmetic operators 
		int i = 5, j=6;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		
		System.out.println("------------");
		
		// assignment operators 
		int k=5;
		System.out.println(k+=10);
		System.out.println(k-=10);
		System.out.println(k*=10);
		System.out.println(k/=10);
		System.out.println(k=10);
		System.out.println("------------");
		
		// Relations operators
		int m = 10, n = 15;
		if (m == n) {
			System.out.println("The both values are equal");
		} else if (m != n) {
			System.out.println("The m is not equal to n");

		} else if (m < n) {
			System.out.println("The m is lesser than n");
		} else if (m > n) {
			System.out.println("The m is greater than n");
		} else if (m <= n) {
			System.out.println("The m is lesser than equal to n");

		} else if (m >= n) {
			System.out.println("The m is greater than equal to n");

		}

		else {
			System.out.println("none of the condition is passed");
		}
		
		
	}

}
