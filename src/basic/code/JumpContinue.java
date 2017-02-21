package basic.code;

public class JumpContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0; i<10; i++){
//			System.out.println(i + " ");
//			if(i%2==0) continue;
//			System.out.println(" ");
//		}
		
		outer:for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(j>i){
					System.out.println();
					continue outer;
				}
				System.out.println(" "+(i));
			}
		}
		System.out.println();
	}

}
