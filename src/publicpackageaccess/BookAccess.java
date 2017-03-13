package publicpackageaccess;

public class BookAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		publicpackage.Book books[] = new publicpackage.Book[2];
		books[0] = new publicpackage.Book("Java", "So Pheak");
		books[1] = new publicpackage.Book("C++", "So Pheak");
		
		for(int i=0; i<books.length; i++){
			books[i].showBook();
		}
	}

}
