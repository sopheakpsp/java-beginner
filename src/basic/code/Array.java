package basic.code;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayTwoDimonson2();
	}
	
	static void arrayOneDimonson(){
		int day_in_month[] = new int[12];
		day_in_month[0] = 31;
		day_in_month[1] = 28;
		day_in_month[2] = 31;
		day_in_month[3] = 30;
		day_in_month[4] = 31;
		day_in_month[5] = 30;
		day_in_month[6] = 31;
		day_in_month[7] = 31;
		day_in_month[8] = 30;
		day_in_month[9] = 31;
		day_in_month[10] = 30;
		day_in_month[11] = 31;
		for (int i = 0; i < day_in_month.length; i++) {
			System.out.println("Month " + (i+1) + " has " + day_in_month[i]+" days");
		}
	}
	
	static void arrayOneDimonson2(){
		int day_in_month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < day_in_month.length; i++) {
			System.out.println("Month " + (i+1) + " has " + day_in_month[i]+" days");
		}
	}
	
	static void arrayTwoDimonson(){
		int myTwoDimonson[][] = new int[5][6];
		int i,j,k=1;
		for (i = 0; i < 5; i++) {
			for(j = 0; j < 6; j++){
				myTwoDimonson[i][j] = (i + j) * k;
				k++;
			}
		}
		
		for(i = 0; i < 4; i++){
			for(j = 0; j < 5; j++){
				System.out.println("myTwoDimonson[" + i + "][" + j + "]" + myTwoDimonson[i][j]);
			}
		}
	}
	
	static void arrayTwoDimonson2(){
		int myTwoArray[][] = new int[4][];
		myTwoArray[0] = new int[1];
		myTwoArray[1] = new int[2];
		myTwoArray[2] = new int[3];
		myTwoArray[3] = new int[4];
		
		int i, j, k=0;
		for(i = 0; i < 4; i++){
			for(j = 0; j < i+1; j++){
				myTwoArray[i][j] = k;
				k++;
			}
		}
		
		for(i = 0; i < 4; i++){
			for(j = 0; j < i+1; j++){
				System.out.print("myTwoArray["+ i +"]["+ j +"]" + myTwoArray[i][j]+ " ");
				System.out.println();
			}
		}
						
	}

}
