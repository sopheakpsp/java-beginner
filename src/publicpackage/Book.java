package publicpackage;

public class Book {
	private String title;
	private String author;
	
	public Book(String t, String a){
		title = t;
		author = a;
	}
	
	public void showBook(){
		System.out.println("Book Title: " +title);
		System.out.println("Book Author: " +author);
	}
}
