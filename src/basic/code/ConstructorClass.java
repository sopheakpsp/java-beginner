package basic.code;

public class ConstructorClass {
	int x, y;
	
	ConstructorClass(){
		x = 10;
		y = 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorClass obj = new ConstructorClass();
		System.out.println("Value before assign x = "+ obj.x +" and y = "+ obj.y);
		
		obj.x = 12;
		obj.y = 17;
		System.out.println("Value after assign x = "+ obj.x +" and y = "+ obj.y);
		
	}
}

/* notice
 * - Constructor method must be the same name with main class
 * - after assigned value the Constructor value will be no more use
 */