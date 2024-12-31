package day8;

public class Employee {
	String empName;
	int empId;
	long empContact;
	double empSalary;
	
	public static void main (String[] a) {
		Employee emp1=new Employee();
		emp1.empName="Abinaya H";
		emp1.empId=10001;
		emp1.empContact=9874653210l;
		emp1.empSalary=15000d;
		System.out.println("Employee Name : "+emp1.empName);
		System.out.println("Employee Id : "+ emp1.empId);
		System.out.println("Employee Contact : "+ emp1.empContact);
		System.out.println( "Employee Salary : "+emp1.empSalary);
		System.out.println();
		Employee emp2=new Employee();
		emp2.empName="Aravinth M";
		emp2.empId=10002;
		emp2.empContact=9801053210l;
		emp2.empSalary=25000d;
		System.out.println("Employee Name : "+emp2.empName);
		System.out.println("Employee Id : "+ emp2.empId);
		System.out.println( "Employee Contact : "+emp2.empContact);
		System.out.println( "Employee Salary : "+emp2.empSalary);
		System.out.println();
		Employee emp3=new Employee();
		emp3.empName="Harini B";
		emp3.empId=10003;
		emp3.empContact=9801078520l;
		emp3.empSalary=45000d;
		System.out.println("Employee Name : "+emp3.empName);
		System.out.println("Employee Id : "+ emp3.empId);
		System.out.println("Employee Contact : "+ emp3.empContact);
		System.out.println("Employee Salary : "+ emp3.empSalary);
		System.out.println();
		Employee emp4=new Employee();
		emp4.empName="Kalai M";
		emp4.empId=10004;
		emp4.empContact=9801044440l;
		emp4.empSalary=21000d;
		System.out.println("Employee Name : "+emp4.empName);
		System.out.println("Employee Id : "+ emp4.empId);
		System.out.println( "Employee Contact : "+emp4.empContact);
		System.out.println("Employee Salary : "+emp4.empSalary);
		System.out.println();
		Employee emp5=new Employee();
		emp5.empName=" Vidhya S";
		emp5.empId=10005;
		emp5.empContact=98011569840l;
		emp5.empSalary=50000d;
		System.out.println("Employee Name : "+emp5.empName);
		System.out.println("Employee Id : "+ emp5.empId);
		System.out.println( "Employee Contact : "+emp5.empContact);
		System.out.println("Employee Salary : "+emp5.empSalary);
	}

}
