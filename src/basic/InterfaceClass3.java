package basic;

public class InterfaceClass3 implements InterfaceClass2, InterfaceClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass3 inf = new InterfaceClass3();
		inf.bike();
		inf.car();
		inf.demo();
		inf.test();
		inf.sample();
		inf.vehicle();
		inf.sampletest();

	}
	@Override
	public void sample() {
		// TODO Auto-generated method stub
		System.out.println("sample");
	}
	@Override
	public void bike() {
		// TODO Auto-generated method stub
		System.out.println("bike");
	}
	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("car");
	}
	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("demo");
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		InterfaceClass.super.test();
		System.out.println("test");
	}
	
	@Override
	public void vehicle() {
		// TODO Auto-generated method stub
		System.out.println("vehicle");
	}
	
	@Override
	public void sampletest() {
		// TODO Auto-generated method stub
		System.out.println("sampletest");
	}
	

}
