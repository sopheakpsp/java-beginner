package basic.code;

class Sup{
	void who(){
		System.out.println("Who in Sup");
	}
}

class Sup1 extends Sup{
	void who(){
		System.out.println("Who in Sup1");
	}
}

class Sup2 extends Sup{
	void who(){
		System.out.println("Who in Sup2");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sup obj = new Sup();
		Sup1 obj1 = new Sup1();
		Sup2 obj2 = new Sup2();
		
		Sup objRef; //declare variable objRef type of Sup
		
		objRef = obj;
		objRef.who();
		
		objRef = obj1;
		objRef.who();
		
		obj2.who();
	}

}
