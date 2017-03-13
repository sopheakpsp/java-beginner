package protectedpackage;

public class Newspaper {
	protected String title;
	protected String author;
	
	public Newspaper(String t, String a){
		title = t;
		author = a;
	}
	
	public void showNewspaper(){
		System.out.println("Newspaper Title: " +title);
		System.out.println("Newspaper Author: " +author);
	}
}
