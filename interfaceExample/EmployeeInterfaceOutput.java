package interfaceExample;

//import interfaceExample.fullTimeEmployee.PartTimeEmployee;

public class EmployeeInterfaceOutput {
	public static void main(String[] args) {
		FullTimeEmployee emp1=new FullTimeEmployee("Anitha.V",1001,20000.00);
		
		emp1.displayEmpDetails();
		emp1.calculateSalary();
		
		PartTimeEmployee emp2=new PartTimeEmployee("Karthik.M",1002, 20,80);
		
		emp2.displayEmpDetails();
		emp2.calculateSalary();
	}
}
