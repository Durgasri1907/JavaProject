package basic;

public class Constructionclass1{
	
	public Constructionclass1() {
		this(25);
		System.out.println("Default constructor");
	}
	
	public Constructionclass1(int f) {
		System.out.println("parent Parameterized constructor " + f);
	}
	
	
}
