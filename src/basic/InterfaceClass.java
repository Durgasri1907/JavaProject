package basic;

public interface InterfaceClass {
	
	public abstract void sample();
	void demo();
	void sampletest();
	void car();
	
	default void test() {
		System.out.println("InterfaceClass test");
		
	}

}
