package basic.code;

public class ReferenceClass {
	int passenger;
	int fuel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceClass ref1 = new ReferenceClass();
		ReferenceClass ref2 = ref1;
		
		ref1.passenger = 1;
		
		System.out.println(ref1.passenger);
		System.out.println(ref2.passenger);
	}

}
