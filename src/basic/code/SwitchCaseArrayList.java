package basic.code;

import java.util.ArrayList;

public class SwitchCaseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> futureMonth = new ArrayList<String>();
		int month = 8;
		
		switch (month){
		case 1 	: futureMonth.add("January");
		case 2 	: futureMonth.add("February");
		case 3 	: futureMonth.add("March");
		case 4 	: futureMonth.add("April");
		case 5 	: futureMonth.add("May");
		case 6 	: futureMonth.add("June");
		case 7 	: futureMonth.add("July");
		case 8 	: futureMonth.add("August");
		case 9 	: futureMonth.add("September");
		case 10 : futureMonth.add("October");
				break;
		case 11 : futureMonth.add("November");
		case 12 : futureMonth.add("December");
				break; // select case not meet break the code this continue till meet break
		default: break;
		}
		
		if(futureMonth.isEmpty()){
			System.out.println("Invalid month");
		}
		else{
			System.out.println(futureMonth.size());
//			for(String monthName : futureMonth){
//				System.out.println(monthName);
//			}
		}
	}

}
