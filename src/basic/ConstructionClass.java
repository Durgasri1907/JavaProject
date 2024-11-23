package basic;

public class ConstructionClass extends Constructionclass1{
	
	int i;
	String str;
	float f;
	
	
	public void method() {
		System.out.println("method");
		System.out.println(i);
		System.out.println(str);
		System.out.println(f);
	}
	
	public ConstructionClass() {
		
		this(10);
		
		
		//Default constructor or Non parameterized constructor
		System.out.println("ConstructionClass");
		i = 15;
		str = "java";
		f = 10.5f;
	}
	
	public ConstructionClass(int i) {
		
		//Parameterized constructor
		
		this(10, "selenium");
		
		System.out.println("Parameterized constructor" + " " + i);
	}
	
	public ConstructionClass(int i, String str) {
		this(10, 15.55f);
		System.out.println("ConstructionClass");
		System.out.println("Parameterized constructor" + i + " " + str);
		
	}
	
	public ConstructionClass(int i, float f) {
		System.out.println("ConstructionClass");
		System.out.println("Parameterized constructor" + i + " " + f);
		
	}
	
	public static void main(String[] args) {
		System.out.println("ConstructionClass");
		ConstructionClass cc = new ConstructionClass();
		cc.method();
	}

}
