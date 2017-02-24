package basic.code;

public class OverloadMethod {
	int sum(int i, int j){
		return i + j;
	}
	
	double sum(double i, double j){
		return i * j;
	}
	
	double sum(double i, double j, int k){
		return i * j - k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadMethod sum = new OverloadMethod();
		
		System.out.println(sum.sum(10, 2)); 
		System.out.println(sum.sum(10.7, 2.5));
		System.out.println(sum.sum(10.7, 2.5, 10));
	}

}

/* @notice:
 * - method must has the same name
 * - different on parameter type 
 * - different on parameter list example: double i, double j, int k
 * - return can be whatever you want
 */
