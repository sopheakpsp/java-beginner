package basic.code;

public class SupperclassReferenceObjectSubclass{
	class X{ 
		int a; 
		
		X(int i){ //construct class X  
			a = i; 
		} 
	 
		class Y extends X{ 
			int b; 
			
			Y(int i, int j){  //construct class Y
				super(j); 
				b=i; 
			} 
		} 
	
	}
	
//	public static void main(String[] agr){ 
//		X x = new X(10); 
//		X x1; 
////		Y y = new Y(7,8);
//		x1=x; // the same type 
//		
//		System.out.println("x1.a " + x1.a); 
////		x1 = y; // OK Y is derived from X; 
//		System.out.println("x1.a " + x1.a); 
//		x1.a=10 ; 
//		//x1.b=2; //error } }
//	}

}
