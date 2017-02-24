package basic.code;

public class InnerOuterClass {
	int nums[];
	
	public InnerOuterClass(int n[]) {
		nums = n;
	}
	
	class Inner{
		int min(){
			int m = nums[0];
			for (int i = 0; i < nums.length; i++) {
				if(nums[i] < m)
					m = nums[i];
			}
		return m;
		}

		int max() {
			int m = nums[0];
			for(int i = 1; i < nums.length; i++){
				if(nums[i] > m)
					m = nums[i];
			}
		return m;
		}

		int avg() {
			int s = 0;
			for(int i = 1; i < nums.length; i++)
				s += nums[i];
			return s / nums.length;
		}
	}
	
	void analyze(){
		Inner inObj = new Inner();
		System.out.println("Minimum: "+ inObj.min());
		System.out.println("Maximum: "+ inObj.max());
		System.out.println("Average: "+ inObj.avg());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArr[] = {1,2,3,5,4,6,8,7,5,8};
		InnerOuterClass obj = new InnerOuterClass(myArr);
		obj.analyze();
	}

}
