package basic.code;

public class StaticBlock {
	static int num;
	static String str;
	
//	block 2
	static{
		System.out.println("Block 2");
		num = 62;
		str = "Block 2";
	}
	
//	block 1
	static{
		System.out.println("Block 1");
		num = 97;
		str = "Block 1";
	}
	
	public static void main(String[] args) {
		System.out.println("value of num is: " + num);
		System.out.println("value of str is: " + str);
	}
}
