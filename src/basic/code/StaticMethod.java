package basic.code;

public class StaticMethod {
	static int num;
	static String str;
	
	public static void main(String[] args) {
		display();
	}
	
	static void display(){
//		StaticMethod obj1 = new StaticMethod();
//		obj1.num = 8;
//		obj1.str = "String 1";
		
		int a = StaticMethod.num = 8;
		String b = StaticMethod.str = "String 1";
		
		System.out.println("StaticMethod num is: " + a);
		System.out.println("StaticMethod str is: " + b);
	}
	
	void functionDisplay(){
		display();
	}
}


/*
 * notice:
 * - static method can only call in the same static method or class
 * - only static variable can call in static method
 * - when use static variable no need to use keyword "this" example StaticMethod.num
 * */
