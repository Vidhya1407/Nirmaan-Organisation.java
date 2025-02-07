package BookManagementSystem;

public class BookMS {
	private int id;
	private String name;
	private long phnNo;
	private String book;
	private double cost;
	
	public BookMS() {
	}

	public BookMS(int id, String name, long phnNo, String book, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.phnNo = phnNo;
		this.book = book;
		this.cost = cost;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "\nLibrary [id=" + id + ", Name=" + name + ", PhnNo=" + phnNo + ", book=" + book + ", cost= $" + cost
				+ "]\n";
	}
	


}
