package basic.code;

class A{
	void show(){
		System.out.println("Class A");
	}
}

class B extends A{
	void show(){
		System.out.println("Class B Overriding Class A");
	}
}

public class OverRidingMethod {
	
	public static void main(String[] args) {
		B b = new B();
		b.show();
	}

}

/*
 * Overriding Method must has the same method name and parameter
 * if the same name but different parameter it is Overloaded method
 */