package basic;

public class Upcasting {
	
	public void demo() {
		System.out.println("demo");
	}
	
	public void test() {
		System.out.println("test");
	}
	
	public void java() {
		System.out.println("java");
	}
	
	public static void main(String[] args) {
		System.out.println("Downcasting");
		Upcasting uc = new UpCasting1();
		UpCasting1 uc1 = (UpCasting1)uc;
		uc1.file();
		uc1.selenium();
	    uc1.demo();
	    uc1.test();
		uc1.java();
	}

}
