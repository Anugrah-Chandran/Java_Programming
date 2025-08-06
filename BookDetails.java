package j_lab;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter = 1000;
	final static String LIBRARY_NAME = "Central Library";
	Book(){
		title = "No title";
		author = "No author";
		bookID = bookCounter;
		bookCounter++;
	}
	Book(String title,String author){
		this.title = title;
		this.author = author;
		bookID = bookCounter;
		bookCounter++;
	}
	public void displayInfo() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Book ID:"+bookID);
	}
	public void displayInfo(boolean showLibrary) {
		if(showLibrary) {
			displayInfo();
			System.out.println("Library Name:"+LIBRARY_NAME);
		}
	}
	public void displayTotalBooks() {
		System.out.println("Total Books:"+(bookCounter-1000));
	}
}

public class BookDetails {
	public static void main(String []args) {
	Book book = new Book();
	book.displayInfo(true);
	book.displayTotalBooks();

}
}