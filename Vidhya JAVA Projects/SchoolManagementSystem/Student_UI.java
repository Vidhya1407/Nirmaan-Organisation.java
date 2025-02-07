package SchoolManagementSystem;

import java.util.Scanner;

public class Student_UI {
	public static void main(String[]args) {
		StudentMS std1 = new StudentMS();
		boolean iswork=true;
		System.out.println("STUDENT MANAGEMENT SYSTEM \n ");

		while(iswork) {
			
			Scanner  sc=new Scanner(System.in);
			System.out.println("Enter your Choice\n");
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for Update");
			System.out.println("Enter 3 for Show");
			System.out.println("Enter 0 for Exit");
			System.out.print("\nEnter your Option : ");	
			int key =sc.nextInt();
			sc.nextLine();
			if(key==1) {
				System.out.print("Enter your Id : ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter your Name : ");
				String name=sc.nextLine();
				System.out.print("Enter your RollNo : ");
				long rollno=sc.nextLong();
				System.out.print("Enter your MobileNo : ");
				long mobileno=sc.nextLong();
				
				std1 = new StudentMS(id,name,rollno,mobileno);
						
			}
			
			else if(key==2){
				
				System.out.println("\nEnter your Choice to updating Student details...\n");

				
					System.out.println("Enter 1 to modilfy Student_id.");
					System.out.println("Enter 2 to modilfy  Student_Name.");
					System.out.println("Enter 3 to modilfy  Student_RollNo.");
					System.out.println("Enter 4 to modilfy  Student_MobileNo.");
					
					System.out.print("\nEnter your Option : ");	

					int keys=sc.nextInt();
					sc.nextLine();
					if(keys==1) {
						System.out.println("Enter your Id:");
						int id = sc.nextInt();
						
						std1.setId(id);
						sc.nextLine();		
						}
					else if(keys==2){
						
						System.out.print("Enter your Name : ");
						String name = sc.nextLine();
						std1.setName(name);
						
					}
					else if(keys==3) {
						
						System.out.print("Enter your RollNo : ");
						long rollno = sc.nextLong();
						std1.setRollno(rollno);
					}
					else if(keys==4) {
						System.out.print("Enter your MobileNo : ");
						long mobileno =sc.nextLong();
						std1.setMobileno(mobileno);
					}
					else {
						System.out.println("\nEnter the correct option\n");
					}
			}
					
			else if (key==3)
					{
						System.out.println(std1);
						
						
					}
					else if(key==0){
						iswork=false;
						System.out.println(".......Thank you........");
					}
					else {
						System.out.println("\n.... Invalid Choice ....\n");
						
					}
		}
	}
}
