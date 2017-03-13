package protectedpackageaccess;

class NewspaperAccess extends protectedpackage.Newspaper{
	private String publisher;
	public NewspaperAccess(String t, String a, String ps){
		super(t, a);
		publisher = ps;
	}
	
	public void showNewspaper(){
		
	}
	
	
}
