package basic.code;

public class ReturnVoidMethod {
	static void VoidMethod(){
		for(int i = 10; i > 0; i--){
			if(i == 3) return;
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidMethod();
	}

}
