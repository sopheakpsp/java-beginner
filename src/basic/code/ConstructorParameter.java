package basic.code;

public class ConstructorParameter {
	int x, y;
	
	ConstructorParameter(int x, int y){
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParameter obj = new ConstructorParameter(12, 17);
		System.out.println("Value before assign x = "+ obj.x +" and y = "+ obj.y);
		
		ConstructorClass construc = new ConstructorClass(); //test instantiate from another file.
		System.out.println(construc.x);
		
	}
}

/*
 * Constructor Parameter must give value parameter when instantiate the class.
 * */
