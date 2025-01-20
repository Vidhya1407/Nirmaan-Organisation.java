package day12;

public class Employee {
	
  
	private String name;
	private String id;
	private long phnNo;
	private double salary;
//default constructor	
    public Employee(){
		
	}
//Paramaterialized constructor	
    public Employee(String name,String id,long phnNo, double salary) {
    	this.name=name;
    	this.id=id;
    	this.phnNo=phnNo;
    	this.salary=salary;
    }
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(long phnNo) {
		this.phnNo = phnNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return "Your name is : " + name + "\nYour ID is : " + id + "\nYour phoneNumber is : " + phnNo + "\nYour salary is : " + salary ;
				
	}
	
}
