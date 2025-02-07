package SchoolManagementSystem;

public class StudentMS {
	int id;
	String name;
	long rollno;
	long mobileno;
	
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
	
	public long getRollno() {
		return rollno;
	}
	
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	public StudentMS(int id, String name, long rollno, long mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.mobileno = mobileno;
	}
	
	public StudentMS(){
		
	}
	
	@Override
	public String toString() {
		return "\nStudent [Id = " + id + ", Name = " + name + ", RollNo = " + rollno + ", MobileNumber = " + mobileno + "]\n";
	}
	

}
