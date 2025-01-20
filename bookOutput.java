package day14;

public class bookOutput {
	public static void main(String[] args) {
		book b=new book();
		b.setId(101);
		b.setBookName("Meendum Oru Kuttram ");
		b.setAuthor("Mrs. Sujatha ");
		b.setAmount("$100");
		
		System.out.println(b);
		
		book b1=new book(102,"One Indian Girl ","Mr. Chetan Bhaget","$305");
		b1.getId();
		b1.getBookName();
		b1.getAuthor();
		b1.getAmount();
		
		System.out.println(b1);
	}

}
