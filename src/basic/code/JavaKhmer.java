package basic.code;

public class JavaKhmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parseInt();
	}

	
	protected static void variableScope(){
		int x = 9;
		
		if(x==9){
			int y=10;
			System.out.println(x+y);
			x=y*3;
		}
		System.out.println("value of x= "+x);
	}
	
	public static void sqaureRoot(){
		int a = 11;
		double b, c;
		b = Math.sqrt(a);
		c = Math.ceil(b);
		System.out.println(c);
	}
	
	public static void typeConversion(){
		int a = 65;
		byte b;
		double c = 275.05;
		
		b = (byte) c;
		c = (float) a;
		
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public static void arithmeticOperator(){
		float a=5, b =10, c=23, d=100;
		float modulus, addAssign, subAssign, multAssign, divisionAssign, modulusAssign;
		
		modulus = b % a;
		
		addAssign = a;
		addAssign += modulus;
		
		subAssign = d;
		subAssign -= a;
		
		multAssign = d;
		multAssign *= a;
		
		divisionAssign = d;
		divisionAssign /= c;
		
		modulusAssign = d;
		modulusAssign %= c;
		
		System.out.println("modulus " + modulus + "\n" + 
							"Addition Assign " + addAssign + "\n" +
							"Subtraction Assign " + subAssign + "\n" +
							"Multiplication Assign " + multAssign + "\n" +
							"Division Assign " + divisionAssign + "\n" +
							"Modulus Assign " + modulusAssign + "\n"
							);
		
	}
	
	public static void Modulus(){
		int a = 35;
		double b = 89.5;
		System.out.println(a % 10);
		System.out.println(b % 10);
	}
	
	public static void parseInt(){
		int a = Integer.parseInt("444", 16);
		int b = a - 25;
		System.out.println(b);
	}
}
