package basic;

public class UpCasting1 extends Upcasting {
	
	public void file() {
		System.out.println("file");
	}
	
	public void selenium() {
		System.out.println("selenium");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Upcasting");
		Upcasting uc = new UpCasting1();
		uc.demo();
		uc.test();
		uc.java();
		
		
	
		

	}

}
