package interfaceExample;

public class PartTimeEmployee implements Employee{
	private String empName;
	private int empId;
	private double hourlyRate;
	private int hoursWorked;
	//constructor for part time emplyee
	public PartTimeEmployee(String empName,int empId,double hourlyRate,int hoursWorked) {
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
		this.empName=empName;
		this.empId=empId;
	}

	@Override
	public void calculateSalary() {
		double Salary=hourlyRate*hoursWorked;
		System.out.println("Monthly Salary of "+empName+" (Part-Time) : $ "+Salary);
		}

	@Override
	public void displayEmpDetails() {
		
		System.out.println("Part_Time Employee-ID : "+empId+" Employee Name : "+empName);	
	}
	
}
