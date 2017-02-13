package basic.code;

public class JumpBreak {
	static int n = 20, i = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BreakFor();
		BreakWhile();
//		BreakDo();
	}


	public static void BreakFor(){
		for(i=0; i<n; i++){
			if(i==9) 
				break;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("This statement is out of for loop");
	}
	
	public static void BreakWhile(){
		while(i<n){
			if(i==9)
				break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println(i);
		System.out.println("This statement is out of while loop");
	}
	
	public static void BreakDo(){
		do{
			System.out.print(i + " ");
			i++;
			if(i==8)
				break;
		}while(i<n);
		System.out.println();
		System.out.println("This statement is out of do while");
	}
}
