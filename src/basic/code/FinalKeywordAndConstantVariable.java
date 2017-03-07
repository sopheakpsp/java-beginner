package basic.code;

/**
 * @author So Pheak
 * OUT_ERROR is constant variable (cannot change value)
 * constant variable are declare by CAPITAL LETTER
 */

class MessageError{
	final int OUT_ERROR = 0;
	final int IN_ERROR = 1;
	final int DISKET_ERROR = 2;
	final int INDEX_ERROR = 3;
	String sms[] = {"Output error","Input Error","Disk Full","Index out of bound"};
	String getMessage(int i){
		if(i>=0 & i<sms.length)
			return sms[i];
		else
			return "Invalid code";
	}
}

public class FinalKeywordAndConstantVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageError sms = new MessageError();
		
		System.out.println(sms.getMessage(sms.OUT_ERROR));
		System.out.println(sms.getMessage(sms.IN_ERROR));
		System.out.println(sms.getMessage(sms.DISKET_ERROR));
	}

}
