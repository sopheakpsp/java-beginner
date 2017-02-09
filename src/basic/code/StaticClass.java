package basic.code;

public class StaticClass {
	static class X{
		static String str = "Inside class X";
	}
	
	public static void main(String args[]){
		X.str = "inside class StaticExplain";
		System.out.println("String stored in str is : " + X.str);
	}
	
}
