package ch07_array_1019;

public class Book {

	private String bookName;
	private String author;
	private int bookPrice;
	
	public Book(){}
	
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public Book(String bookName, String author, int bookPrice) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo(){
		System.out.println(bookName + "," + author + "," + bookPrice);
	}
}
