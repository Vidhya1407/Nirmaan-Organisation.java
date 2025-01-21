package day10;

public class Employee {
	private int id;
	private String name;
	private long contact;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int id) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.salary = salary;
	}
	public Employee(String name) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.salary = salary;
	}
	public Employee( long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.salary = salary;
	}
	public Employee(double salary) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.salary = salary;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Details [Employee ID= " + id + ", Employee Name= " + name + ", Employee Contact= " + contact + ", Employee Salary= $" + salary + " ]";
	}
	

	

}
