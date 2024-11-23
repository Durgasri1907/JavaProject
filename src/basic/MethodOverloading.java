package basic;

public class MethodOverloading {
	
	private void payment() {
		System.out.println("Default");  
	}
	
	private void payment(int n) {
		System.out.println("Int parameterized" + n);
	}
	
	private void payment(byte num) {
		System.out.println("byte parameterized" + num);
	}
	
	void payment(int n, int n1) {
		System.out.println("Int Int parameterized" + n + " " + n1);
	}
	
	protected void payment(String text) {
		System.out.println("String parameterized" + text);
	}
	
	private void payment(char value) {
		System.out.println("Character parameterized" + value);
	}


	public void payment(String text, int n) {
		System.out.println("String Int parameterized" + text + n);
	}
	
	public void payment(int n, String text) {
		System.out.println("Int String parameterized" + n +text);
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		MethodOverloading mo = new MethodOverloading();
		mo.payment();
		mo.payment(5);
		mo.payment('f');
		mo.payment("Method overloading");
		mo.payment(5, 10);
		mo.payment(10, "added");
		mo.payment("added", 15);
		mo.payment((byte)5);

	}

}
