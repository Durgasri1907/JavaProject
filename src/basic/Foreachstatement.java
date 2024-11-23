package basic;

public class Foreachstatement {
	
public static void main(String[] args) {
	int a[] = {5,10,15,20,25};
	for (int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("-------------");
	for (int i : a) {
		System.out.println(i);
	}
	System.out.println("-------------");
	
	// 5 10 15
	// 2  4  6
	// 9 12 17
	
	int multarray [][] = {{5,10,15}, {2,4,6}, {9, 12, 17}};
	for (int i=0; i<multarray.length; i++) {
		for (int j=0; j<multarray[0].length; j++) {
			System.out.print(multarray[i][j]+ " ");
		}
		System.out.println("");
	}
	 	
}

}
