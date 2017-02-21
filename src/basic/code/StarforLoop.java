package basic.code;

public class StarforLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "*";
		String k = "      ";
		int j = 1;
		
		while(j <= 6){
			System.out.println(k+i);
			j++;
		}
		
		while(j <= 6){
			System.out.println(i);
			i = i+"*";
			j++;
		}
	}

}
