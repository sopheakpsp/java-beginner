package basic.code;

import java.util.Scanner;

public class WhileLoop {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		String input;
		
		while(true){
			System.out.println(num + " ");
			System.out.println("Count continue?(Y / N)");
			input = sc.next();
			
			if(input.equalsIgnoreCase("N")) break;
			num += 1;
		}
		System.out.println("Closed!");
	}

}
