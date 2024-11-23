package basic;

public class Keyword {
	
	static int a = 15;
	final int b = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		Keyword kw =  new Keyword();
		//System.out.println(kw.b);
		//kw.b = 20;
		System.out.println(kw.b);
		
		kw.sample();
		demo();
		}
	
	public Keyword sample() {
		System.out.println("--------------------");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------------");
		int arr[] = {10, 20, 30, 40};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		Keyword kw = new Keyword();
		return kw;

	}
	
	public static void demo() {
		System.out.println("--------------------");
		System.out.println("demo");
		System.out.println(a);
		Keyword kw = new Keyword();
		System.out.println(kw.b);
		System.out.println("--------------------");
	}

}

