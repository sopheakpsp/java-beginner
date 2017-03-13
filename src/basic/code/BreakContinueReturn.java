package basic.code;

public class BreakContinueReturn {

	/**
	 * Test running 
	 * break; and 
	 * continue;
	 * it's easy to understand
	 */
	
	public static void main(String[] args) {
		
	
		int j = 100;

		for (int i = 0; i < j; i++) {
			if(i == 7)
//				break;
//				continue;
				return;
			System.out.println(i);
		}		
	

		

	}

}
