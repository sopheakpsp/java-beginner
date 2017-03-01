package basic.code;

public class InnerClassInLoop { //Outer Class
	int outer_x = 100;
	void test(){
		for (int i = 1; i < 10; i++) {
			System.out.print(i);
			
			class Inner{
				void display(){
					System.out.println(" Display outer_x " + outer_x);
				}
			}
			
			Inner inObj = new Inner();
			inObj.display();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassInLoop outObj = new InnerClassInLoop();
		outObj.test();
	}

}
