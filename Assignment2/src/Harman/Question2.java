package Harman;

class Book{
	private String bookTitle;
	private String Author;
	private String ISBN;
	private int quantity;
	public String getBookTitle() {
		return bookTitle;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book(String bookTitle, String auther, String iSBN, int quantity) {
		this.bookTitle = bookTitle;
		this.Author = auther;
		this.ISBN = iSBN;
		this.quantity = quantity;
	}
	public void display() {
		System.out.println("---Book Details------");
		System.out.println("Book Title: " + bookTitle);
		System.out.println("Author: " + Author);
		System.out.println("ISBN: " + ISBN);
		System.out.println("Number of copies: " + quantity);
		System.out.println("---------------------");

	}
	
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book Book=new Book("Wings of Fire","Abdul Kalam","AEF34",11);
		Book.display();
	}

}
