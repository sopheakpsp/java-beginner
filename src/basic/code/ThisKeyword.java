package basic.code;

public class ThisKeyword {
	double xPos, yPos;
	double fly(int xPos, int yPos){
		double distance = xPos + yPos;
		
		this.xPos = xPos; // assign xPos value in method fly() to xPos in class ThisKeyword 
		this.yPos = yPos; // assign xPos value in method fly() to xPos in class ThisKeyword
		
		return distance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword thisKeyword = new ThisKeyword();
		
		double thisK = thisKeyword.fly(18, 17);
		double xPos = thisKeyword.xPos;
		double yPos = thisKeyword.yPos;
		
		System.out.println(thisK);
		System.out.println(xPos);
		System.out.println(yPos);
		
	}

}
