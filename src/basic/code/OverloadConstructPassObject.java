package basic.code;

public class OverloadConstructPassObject {
	int sum;
	
	public OverloadConstructPassObject(int num) {
		sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
	}
	
	public OverloadConstructPassObject(OverloadConstructPassObject obj){
		sum = obj.sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadConstructPassObject obj1 = new OverloadConstructPassObject(12);
		System.out.println("obj1 = "+ obj1.sum);
		
		OverloadConstructPassObject obj2 = new OverloadConstructPassObject(obj1);
		System.out.println("obj2 = "+ obj2.sum);

	}

}

