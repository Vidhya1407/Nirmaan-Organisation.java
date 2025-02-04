package interfaceExample;

class FullTimeEmployee implements Employee{
	private String empName;
	private int empID;
	private double monthlySalary; 
	//constructor of full time employee
	public FullTimeEmployee(String empName,int empID,double monthlySalary) {
		this.empName=empName;
		this.empID=empID;
		this.monthlySalary=monthlySalary;
		}

	@Override
	public void calculateSalary() {
		System.out.println("Monthly Salary of "+empName+" (Full-Time) : $ "+monthlySalary);
	}

	@Override
	public void displayEmpDetails() {
		System.out.println("Full_Time Employee-ID : "+empID+" Employee Name : "+empName);
		
	}
}
