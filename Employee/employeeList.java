package Employee;

public class employeeList {
	private int Emp_Id;
	private String Emp_Name;
	private long Emp_Contact;
	private String Emp_Dept;
	private double Emp_Salary;
	public int getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public long getEmp_Contact() {
		return Emp_Contact;
	}
	public void setEmp_Contact(long emp_Contact) {
		Emp_Contact = emp_Contact;
	}
	public String getEmp_Dept() {
		return Emp_Dept;
	}
	public void setEmp_Dept(String emp_Dept) {
		Emp_Dept = emp_Dept;
	}
	public double getEmp_Salary() {
		return Emp_Salary;
	}
	public void setEmp_Salary(double emp_Salary) {
		Emp_Salary = emp_Salary;
	}
	
	public employeeList(int emp_Id, String emp_Name, long emp_Contact, String emp_Dept, double emp_Salary) {
		super();
		Emp_Id = emp_Id;
		Emp_Name = emp_Name;
		Emp_Contact = emp_Contact;
		Emp_Dept = emp_Dept;
		Emp_Salary = emp_Salary;
	}
	public employeeList() {
		super();
	}
	@Override
	public String toString() {
		return "employee"+Emp_Id+" [Emp_Id=" + Emp_Id + ", Emp_Name=" + Emp_Name + ", Emp_Contact=" + Emp_Contact
				+ ", Emp_Dept=" + Emp_Dept + ", Emp_Salary=" + Emp_Salary + "]";
	}
	

}
