package basic.code;

public class ReturnValueInClass {
	int passenger;
	int fuel;
	
	int range(){
		return fuel * passenger;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnValueInClass lamboghini = new ReturnValueInClass();
		lamboghini.passenger = 2;
		lamboghini.fuel = 17;
		
		int range = lamboghini.range();
		
		System.out.println(range);
	}

}
