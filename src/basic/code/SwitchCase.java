package basic.code;

class SwitchCase { 
	public static void main(String[] args) {
		boolean b;		// to check the year mod 4 equal 0 
		int year; 		// store year input 
		int month; 		//store month input 
		
		year = Integer.parseInt(args[0]); 
		month = Integer.parseInt(args[1]); 
		
		if ((year%4) == 0) 
			b=true; 
		else 
			b=false; 
		
		switch (month){ 
		case 1: System.out.println("This " + year + " January has 31 days"); 
				break; 
		case 2: if (b==true) 
					System.out.println(" This " + year + " February has 29 days"); 
				else 
					System.out.println(" This " + year + " February has 28 days"); 
				break; 
		case 3: System.out.println(" This " + year + " March has 31 days"); 
				break; 
		case 4: System.out.println(" This " + year + " April has 30 days"); 
				break; 
		case 5: System.out.println(" This " + year + " May has 31 days"); 
				break; 
		case 6: System.out.println(" This " + year + " June has 30 days"); 
				break; 
		case 7: System.out.println(" This " + year + " July has 31 days"); 
				break; 
		case 8: System.out.println(" This " + year + " August has 31 days"); 
				break; 
		case 9: System.out.println(" This " + year + " September has 30 days"); 
				break; 
		case 10: System.out.println(" This " + year + " October has 31 days"); 
				break; 
		case 11: System.out.println(" This " + year + " November has 30 days"); 
				break; 
		case 12: System.out.println(" This " + year + " December has 31 days");
				break; 
		default: System.out.println(" Input invalid month (1-12) "); 
		} 	
	}
}