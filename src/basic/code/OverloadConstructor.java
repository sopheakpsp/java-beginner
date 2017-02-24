package basic.code;

public class OverloadConstructor {
	int x;
	
	OverloadConstructor() {
		x = 0;
	}
	
	OverloadConstructor(int i){
		this.x = i;
	}
	
	OverloadConstructor(double d){
		x = (int) d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadConstructor oC = new OverloadConstructor(6.9); 
		System.out.println(oC.x);
	}
}

/*
 * the value depend on parameter in constructor your called
 */