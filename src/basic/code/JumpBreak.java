package basic.code;

public class JumpBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20, i = 0;
		
		for(i=0; i<n; i++){
			if(i==9) 
				break;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("This statement is out of for loop");
		
		while(i<n){
			if(i==9)
				break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println(i);
		System.out.println("This statement is out of while loop");
		
		do{
			System.out.print(i + " ");
			i++;
		}while(i<n);
		System.out.println();
		System.out.println("This statement is out of do while");
		
	}

}
