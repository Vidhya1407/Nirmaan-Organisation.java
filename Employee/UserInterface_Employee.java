package Employee;

import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface_Employee {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		employeeList obj=new employeeList();
		ArrayList<employeeList> empArray=new ArrayList<>();
		boolean isWork=true;
		System.out.println("Employee Management List \n");
		
		while(isWork) {
			System.out.println();
			System.out.println("Enter 1 for ADD employee.");
			System.out.println("Enter 2 for UPDATE employee.");
			System.out.println("Enter 3 for REMOVE employee.");
			System.out.println("Enter 4 for SHOW employee.");
			System.out.println("Enter 0 for EXIT.");
			System.out.println();
			System.out.println("ENTER THE CHOICE : ");
			int choice=scanner.nextInt();			
			if(choice==0) {
				System.out.println("......THANK YOU......");
			}
			else if(choice==1) {
				System.out.print("\nEnter employee id :");
				int emp_Id=scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter employee name : ");
				String emp_Name=scanner.nextLine();
				System.out.print("Enter employee contact : ");
				long emp_Contact=scanner.nextLong();
				scanner.nextLine();
				System.out.print("Enter employee department : ");
				String emp_Dept=scanner.nextLine();
				System.out.print("Enter employee Salary : ");
				double emp_Salary=scanner.nextDouble();
				empArray.add(obj=new employeeList(emp_Id, emp_Name, emp_Contact, emp_Dept, emp_Salary));
			}
			else if(choice==2) {
				System.out.println("Enter the employee_Id to update : ");
				int Id=scanner.nextInt();
				boolean work=true;
				for(employeeList upd:empArray) {
					if(upd.getEmp_Id()==Id) {
						scanner.nextLine();
						System.out.print("Enter employee name : ");
						String Name=scanner.nextLine();
						upd.setEmp_Name(Name);
						System.out.print("Enter employee contact : ");
						long Contact=scanner.nextLong();
						upd.setEmp_Contact(Contact);
						scanner.nextLine();
						System.out.print("Enter employee department : ");
						String Dept=scanner.nextLine();
						upd.setEmp_Dept(Dept);
						System.out.print("Enter employee Salary : ");
						double Salary=scanner.nextDouble();
						upd.setEmp_Salary(Salary);
					     
						work=false;
					}
				}
				if(!work) {
					System.out.println("This employee Id is not there.");
				}
			}
			else if(choice==3) {
				System.out.println("Enter the employee_Id to remove : ");
				int id=scanner.nextInt();
				boolean works=true;
				for(employeeList rem:empArray) {
					if(rem.getEmp_Id()==id) {
						works=false;
						empArray.remove(rem);

						break;
					}
				}
				
			}
			else if(choice==4) {
				System.out.println("\t\t\tEMPLOYEE DETAILS");
				System.out.println(empArray);
				
			}
		}


	}
	}
