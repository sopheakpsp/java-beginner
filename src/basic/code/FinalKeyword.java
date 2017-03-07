package basic.code;

class FA{
	final void myShow(){
		System.out.println("This is Final Keyword");
	}
}

/**
 * @author So Pheak
 * myShow() method cannot overriding from superclass because it has 
 * final keyword to prevent inheritance. 
 */

class FB extends FA{
	void myShow(){
		System.out.println("This is inheritant class");
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
		FA a = new FB();
		a.myShow();
	}
}

