package basic.code;

public class StaticVariable {
	static int num = 77;
	String str = "I Am ";
	
	public static void main(String[] args) {
		StaticVariable obj1 = new StaticVariable();
		StaticVariable obj2 = new StaticVariable();
		
//		static way 
		int num = StaticVariable.num;
		
//		obj1.num = 88;
		obj1.str = "Not I am";
		
//		obj2.num = 99;
		obj2.str = "That is she";
		
		System.out.println("obj1 num is " + num);
		System.out.println("obj1 str is " + obj1.str);
		
		System.out.println("obj2 num is " + num);
		System.out.println("obj2 str is " + obj2.str);
	}
}
