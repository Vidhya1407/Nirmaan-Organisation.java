package SchoolManagementSystem;
import java.util.Scanner;
public class Teacher_UI {
	public static void main(String[]args) {
		TeacherMS teacher = new TeacherMS();
		boolean iswork=true;
		System.out.println("TEACHER MANAGEMENT SYSTEM \n");

		while(iswork) {
			
			Scanner  sc=new Scanner(System.in);
			System.out.println("Enter your choice\n");
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for Update");
			System.out.println("Enter 3 for Show");
			System.out.println("Enter 0 for Exit");
			System.out.print("\nEnter your Option : ");
            int key =sc.nextInt();
			sc.nextLine();
			switch(key) {
			case 1:{
				System.out.print("Enter your Id :");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter your Name :");
				String name=sc.nextLine();
				System.out.print("Enter your MobileNumber :");
				long mobileno=sc.nextLong();
				System.out.print("Enter your Salary");
				double salary=sc.nextDouble();				
				teacher = new TeacherMS(id,name,mobileno,salary);
				break;
						
			}
			
			case 2: {
				System.out.println("\nEnter your Choice to updating Teacher details...\n");

				System.out.println("Enter 1 to modilfy Id");
				System.out.println("Enter 2 to modilfy Name");
				System.out.println("Enter 3 to modilfy MobileNumber");
				System.out.println("Enter 4 to modilfy Salary");
				
				System.out.print("Enter your Option : ");
				int keys=sc.nextInt();
				
				sc.nextLine();
				if(keys==1) {
					System.out.println("Enter your Id:");
					int id = sc.nextInt();
					
					teacher.setId(id);
					sc.nextLine();		
					}
				else if(keys==2){
					
					System.out.println("Enter your Name:");
					String name = sc.nextLine();
					teacher.setName(name);
					
				}
				else if(keys==4) {
					System.out.println("Enter your MobileNo:");
					long mobileno =sc.nextLong();
					teacher.setMobileno(mobileno);
				}
                else if(keys==3) {
					
					System.out.println("Enter your Salary:");
					double salary = sc.nextDouble();
					teacher.setSalary(salary);
				}
				else {
					System.out.println("Enter your correct input");
				}
				break;
			}
			
			case 3: {
				System.out.println(teacher);
				break;
			}
			
			case 0: {
				System.out.println("Thank you");
				iswork=false;
				break;
		
				
				
			}
			
			default: {
				System.out.println("Enter the correct choice");
			}
			}		
	}

}

}
