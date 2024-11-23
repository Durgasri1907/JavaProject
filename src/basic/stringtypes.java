package basic;

public class stringtypes {
	
	public static void main(String[] args) {
		String str = "Welcome to coding world";
		
		
		System.out.println(str);
		
		int length = str.length();
		System.out.println(length);
		
		int index = str.lastIndexOf('c');
		System.out.println(index);
		
		String s1 = "   Welcome to Coding world  ";
		boolean equals = str.equals(s1);
		System.out.println(equals);
		
		String s2 = "Welcome to Coding world";
		boolean equals1 = str.equalsIgnoreCase(s1);
		System.out.println(equals1);
		
		String uppercase = str.toUpperCase();
		System.out.println(uppercase);
		
		String lowercase = str.toLowerCase();
		System.out.println(lowercase);
		
		Boolean startswith = str.startsWith("W");
		System.out.println(startswith);
		
		Boolean endswith = str.endsWith("d");
		System.out.println(endswith);
		
		char charAt = str.charAt(14);
		System.out.println(charAt);
		
		String replace = str.replaceFirst("e", "f");
		System.out.println(replace);
		
		String substring = str.substring(2,5);
		System.out.println(substring);

		String trim = str.trim();
		System.out.println(trim);
		
		StringBuffer obliq = new StringBuffer(str);
		System.out.println(obliq);
		
		for (char chars: str.toCharArray()) {
			System.out.println(chars);
		}
	
		
		
	}

}
