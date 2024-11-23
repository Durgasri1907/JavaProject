package basic;

public class TypeCasting {
	
	//narrowing typecasting
	int i = 50;
	byte b = (byte)i;
	
	//Widening typecasting
	short f = 15;
	int g = f;
	
	public static void main(String[] args) {
		TypeCasting tc = new TypeCasting();
		System.out.println("narrowing typecasting");
		System.out.println(tc.b);
		System.out.println("Widening typecasting");
		System.out.println(tc.g);
	}
	
	

}
