package basic.code;

public class MethodWithParameter {
	int sumValue(int a, int b){
		return a + b;
	}
	
	int modolusValue(int a, int b){
		return a % b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithParameter value = new MethodWithParameter();
		int modolus = value.modolusValue(10, 2);
		int sum = value.sumValue(10, 2);
		
		System.out.println(sum);
		System.out.println(modolus);
	}

}
