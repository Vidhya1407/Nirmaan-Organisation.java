package day14;

public class book {
	private int id;
	private String bookName;
	private String author;
	private String amount;
	
	public  book() {
		
	}
	
	public book(int id,String bookName,String author,String amount) {
		this.id=id;
		this.bookName=bookName;
		this.author=author;
		this.amount=amount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return "\n...... Details......\n\n Book ID : "+id+"\n Book Name : "+bookName+"\n Author : "+author+"\n Price of book : "+amount;
	}
	

}
