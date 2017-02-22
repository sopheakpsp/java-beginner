package basic.code;

public class Vehicle {
	int passenger;
	int fuelcap;
	int mpg;
	
	void range(){
		System.out.println("Range is "+ fuelcap * mpg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle minicar = new Vehicle();
		
		minicar.passenger = 2;
		minicar.fuelcap = 4;
		minicar.mpg = 5;
		
		minicar.range();
	}

}
