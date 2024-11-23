package basic;

public class Inheritance {
	
	public void method() {
		System.out.println("Public method");
	}
	
	private void demo() {
		System.out.println("private demo");
	}
	
	protected void test() {
		System.out.println("protected test");
	}
	
	void car() {
		System.out.println("default car");
	}
	
	public static void main(String[] args) {
		Inheritance newFile = new Inheritance();
		newFile.car();
		newFile.demo();
		newFile.method();
		newFile.test();
	}

}
