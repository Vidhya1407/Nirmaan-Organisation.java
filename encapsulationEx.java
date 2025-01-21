package day10;
import java.util. Scanner;
public class encapsulationEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();      //create OBJECT to call the constructor
        Employee emp1=new Employee(emp.toString());

		boolean isWork=true;
		
		while(isWork) {
			System.out.println("\nSELECT THE GIVEN CHOICE ");
			System.out.println("Click '1' for ADD Employee details ");
			System.out.println("Click '2' for UPDATE Employee details ");
			System.out.println("Click '3' for SHOW  Employee details ");
			System.out.println("Click '0' for STOP ");
			int key=sc.nextInt();
			
        	if(key==1) {
    			System.out.print(" Enter the Employee ID : ");
    			int id=sc.nextInt();
    			emp.setId(id);
    			sc.nextLine();
    			System.out.print(" Enter the Employee Name : ");
    			String name=sc.nextLine();
    			emp.setName(name);
    			System.out.print(" Enter the Employee Contact : ");
    			long contact=sc.nextLong();
    			emp.setContact(contact);
    			System.out.print(" Enter the Employee Salary : ");
    			double salary=sc.nextDouble();
    			emp.setSalary(salary);
    		    
    			emp.toString();
			}
        	else if(key==2) {
        		boolean work=true;
        		System.out.println("\nWhere you want to update ");
    			System.out.println("Click '0' for change All details");
    			System.out.println("Click '1' for change Emp_Id ");
    			System.out.println("Click '2' for change Emp_Name ");
    			System.out.println("Click '3' for change Emp_Contact ");
    			System.out.println("Click '4' for change Emp_Salary ");
                int key1=sc.nextInt();//take new input to operates switch cases
                String temp;
       
                 emp1=emp;
                 
                
        		switch(key1) {
        		case 0:
        			System.out.print(" Enter the Employee ID : ");
        			int id=sc.nextInt();
        			emp1.setId(id);
        			sc.nextLine();
        			System.out.print(" Enter the Employee Name : ");
        			String name=sc.nextLine();
        			emp1.setName(name);
        			System.out.print(" Enter the Employee Contact : ");
        			long contact=sc.nextLong();
        			emp1.setContact(contact);
        			System.out.print(" Enter the Employee Salary : ");
        			double salary=sc.nextDouble();
        			emp1.setSalary(salary);
        			
        			emp1.toString();
        			break;
        		case 1:
        			System.out.print(" Enter the Employee ID : ");
        			int id1=sc.nextInt();
        			emp1.setId(id1);
        			System.out.println("Updating Id = "+emp1.getId());
        			
        			break;
        		case 2:
        			sc.nextLine();
        		    System.out.print(" Enter the Employee Name : ");
        			String name1=sc.nextLine();
                    emp1.setName(name1);
                    System.out.println("Updating Name = "+emp1.getName());
                    
        			break;
        		case 3:
        			System.out.print(" Enter the Employee Contact : ");
        			long contact1=sc.nextLong();
        		    emp1.setContact(contact1);
        		    System.out.println("Updating Contact = "+emp1.getContact());
        		    
        		    break;
        		case 4:
        			System.out.print(" Enter the Employee Salary : ");
        			double salary1=sc.nextDouble();
        			emp1.setSalary(salary1);
        			System.out.println("Updating Salary = $"+emp1.getSalary());
        			
        			break;
        		default:
        			System.out.println("None of the option");
        			work=false;
        		}
        	}
        	else if(key==3) {
        		//System.out.println(emp.toString());
        		
        		System.out.println(emp);
        	}
        	
        	else if(key==0) {
        		System.out.println("..............* Thank You *..............");
        		isWork=false;
        	}
        	else {
        		
        		System.out.println("Invalid Choice");
        		isWork=false;
        	}
		}
		
	}

}
