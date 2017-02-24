package basic.code;

public class RecursiveMethod {
	int factorial(int i){
		if(i == 1) return 1;
		return factorial(i - 1)*i;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveMethod recursive = new RecursiveMethod();
		
		System.out.println("Ths factorial 6 is "+ recursive.factorial(3));
	}

}

/*
 * Factorial formula 
 * for more reference: <a href="https://www.programiz.com/c-programming/c-recursion">reference</a>
 * */
