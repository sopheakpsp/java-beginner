package protectedpackageaccess;

import protectedpackage.*; 

/**
 * @author So Pheak
 * Keyword import usage 
 */

public class ImportPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newspaper newspaper[] = new Newspaper[2];
		newspaper[0] = new Newspaper("PHP", "So Pheak");
		newspaper[1] = new Newspaper("C#", "So Pheak");
		
		for(int i=0; i<newspaper.length; i++){
			newspaper[i].showNewspaper();
		}
	}

}

