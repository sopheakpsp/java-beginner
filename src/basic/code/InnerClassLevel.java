package basic.code;

class InnerClassLevel { //Class A Outer Class
	int x, y;
	int sum(){
		return x+y;
	}
	
	class B{
		int z;
		int mySum(){
			return x+z+y;
		}
	}


static class AB{
	public static void main(String[] args) {
		InnerClassLevel aObj = new InnerClassLevel();
		InnerClassLevel.B bObj = aObj.new B();
		aObj.x = 5;
		aObj.y = 8;
		bObj.z = 9;
		System.out.println("Sum = " + bObj.mySum());
	}
}
}