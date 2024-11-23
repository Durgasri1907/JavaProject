package basic;

public interface InterfaceClass2 {
	
	void vehicle();
	void car();
	void bike();
	
	default void test() {
		System.out.println("InterfaceClass2 test");
		
	}
	

}
