package bd.rakib.library;

public class Book {
	private String title;
	private String author;
	private String category;
	private String ISBN;
	private double price;
	
	
	
	public Book(String title, String author, String category, String iSBN, double price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		ISBN = iSBN;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "[" + title + " " + author + " " + category + " " + ISBN + " " + price + "]";
		
	}
	
}
