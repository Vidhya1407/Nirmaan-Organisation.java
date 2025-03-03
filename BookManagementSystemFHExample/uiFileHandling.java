package BookManagementSystemFHExample;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.TreeSet;


class Book22 implements Serializable,Comparable<Book22>{
	private int id;
	private String name;
	private long phnNo;
	private String book;
	private double cost;
	
	public Book22() {
	}

	public Book22(int id, String name, long phnNo, String book, double cost) {
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
	
    public int compareTo(Book22 o) {
    	if(id<o.id) {
    		return -1;
    	}
    	if(id>o.id) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
 
    	
}

	
}

public class uiFileHandling {
	

	
    static void writeBook(String filePath,TreeSet<Book22> ts){
    	
    	try{
    		FileOutputStream fos=new FileOutputStream(filePath);
        	ObjectOutputStream oos=new ObjectOutputStream(fos);
        	oos.writeObject(ts);
        	oos.close();
        	fos.close();
        	System.out.println("Successfully written in a file!\n");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    }
    static TreeSet<Book22> readBook(String filePath){
    	TreeSet<Book22> TSB=new TreeSet<Book22>();
    	try{
    		FileInputStream fis=new FileInputStream(filePath);
        	ObjectInputStream ois=new ObjectInputStream(fis);
        	TSB=   (TreeSet<Book22>)   ois.readObject();
        	ois.close();
        	fis.close();
        	System.out.println("Readed !\n");
    		
    	}catch(Exception e) {
    		System.out.println("File is empty.");
    	}
    	
		return TSB;
    	
    }
    
    
	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Book22 lms=new Book22();
		TreeSet<Book22> ts1=new TreeSet<Book22>();
		boolean isWork=true;
		System.out.println("........BOOK MANAGEMENT SYSTEM ........ ");
		String filePath="C:\\Users\\Admin\\Desktop\\FileHandling\\fileJava\\text.txt";
		while(isWork) {
			System.out.println("\nChoose the Option from below choices :- \n ");
			System.out.println("Click '1' for ADD Customer details");
			System.out.println("Click '2' for UPDATE Customer details");
			System.out.println("Click '3' for SHOW Customer details");
			System.out.println("Click '0' for EXIT ");
			System.out.print("\nEnter your Option : \n ");
			int key=input.nextInt();
			
			if(key==1) {
				ts1=readBook(filePath);
				System.out.print("Enter Costomer_Id: ");
				int id=input.nextInt();
				input.nextLine();
				System.out.print("Enter Costomer_Name : ");
				String name=input.nextLine();
				System.out.print("Enter Costomer_PhnNo : ");
				long phnNo=input.nextLong();
				System.out.print("Enter Book_Name : ");
				String book=input.next();
				System.out.print("Enter price: ");
				double cost=input.nextDouble();
				lms = new Book22(id, name, phnNo, book, cost);
				ts1.add(lms);
				
				writeBook(filePath,ts1);
			}
			else if(key==2) {
				ts1=readBook(filePath);
				System.out.println("Enter your Choice to updating...");
				System.out.println("Click '0' for CHANGE ALL");
				System.out.println("Click '1' for CHANGE ID");
				System.out.println("Click '2' for CHANGE NAME");
				System.out.println("Click '3' for CHANGE CONTACT ");
				System.out.println("Click '4' for CHANGE BOOK ");
				System.out.println("Click '5' for CHANGE PRICE ");
				
				int choice=input.nextInt();
				
				switch (choice) {
				case 1: 
					System.out.print("Enter Costomer_Id: ");
					int id=input.nextInt();
					lms.setId(id);	
					
					
					break;
				
				case 2:
					input.nextLine();
					System.out.print("Enter Costomer_Name : ");
					String name=input.nextLine();
					lms.setName(name);
				
					break;
				
				case 3:
					System.out.print("Enter Costomer_PhnNo : ");
					long phnNo=input.nextLong();
					lms.setPhnNo(phnNo);
					
					break;
				
				case 4:
					System.out.print("Enter Book_Name : ");
					String book=input.next();
					lms.setBook(book);
				
					break;
					
				case 5:
					System.out.print("Enter price: ");
					double cost=input.nextDouble();
					lms.setCost(cost);
					
					break;
					
				case 0:{
					System.out.print("Enter Costomer_Id: ");
					int id1=input.nextInt();
					lms.setId(id1);
					input.nextLine();
					System.out.print("Enter Costomer_Name : ");
					String name1=input.nextLine();
					lms.setName(name1);
					System.out.print("Enter Costomer_PhnNo : ");
					long phnNo1=input.nextLong();
					lms.setPhnNo(phnNo1);
					System.out.print("Enter Book_Name : ");
					String book1=input.next();
					lms.setBook(book1);
					System.out.print("Enter price: ");
					double cost1=input.nextDouble();
					lms.setCost(cost1);
					
					lms =new Book22(id1, name1, phnNo1, name1, cost1);
					break;
				}
				default:
					
					System.out.println(" Incorrect option ");
			}
				writeBook(filePath,ts1);

			}
			else if(key==3) {
				ts1=readBook(filePath);
				System.out.println(lms);
				writeBook(filePath,ts1);

			}
			else if(key==0) {
				ts1=readBook(filePath);
				isWork=false;
				System.out.println(" Thank You ");
				writeBook(filePath,ts1);

			}
			else
				System.out.println("Enter the Correct Option");


		}


	}


}
