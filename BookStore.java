package java_lab;

class Book{
	String title;
	String author;
	double price;
	int quantity;
	double total_value;
	Book(String title,String author,double price,int quantity){
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		
	}
	public void calculateValue() {
		total_value = price*quantity;
	}
	public void displayDetails() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Total Price:"+total_value);	
	}
	
}

public class BookStore {
	public static void main (String [] args) {
		Book book = new Book("Goat Life","Benyamin",1000,5);
		book.calculateValue();
		book.displayDetails();
		Book book2 = new Book("Wnigs of Fire","A P J Abdul Kalam",2000,10);
		book2.calculateValue();
		book2.displayDetails();
	}

}
