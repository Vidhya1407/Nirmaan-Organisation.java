package BookManagementSystem;

import java.util.Scanner;

import day15.BookMS ;

public class UI_BookMS {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		libraryMS lms=new libraryMS();
		boolean isWork=true;
		System.out.println("SINGLE BOOK MANAGEMENT SYSTEM  ");

	
		while(isWork) {
			System.out.println("\nChoose the Option from below choices :- \n ");
			System.out.println("Click '1' for ADD Customer details");
			System.out.println("Click '2' for UPDATE Customer details");
			System.out.println("Click '3' for SHOW Customer details");
			System.out.println("Click '0' for EXIT ");
			System.out.print("\nEnter your Option : \n ");
			int key=input.nextInt();
			
			if(key==1) {
				System.out.print("Enter Costomer_Id: ");
				int id=input.nextInt();
				input.nextLine();
				System.out.print("Enter Costomer_Name : ");
				String name=input.nextLine();
				System.out.print("Enter Costomer_PhnNo : ");
				long phnNo=input.nextLong();
				System.out.print("Enter Book_Name : ");
				String book=input.next();
				System.out.print("Enter price: ");
				double cost=input.nextDouble();
				
				
				lms =new libraryMS(id, name, phnNo, name, cost);
				
			}
			else if(key==2) {
				System.out.println("Enter your Choice to updating...");
				System.out.println("Click '0' for CHANGE ALL");
				System.out.println("Click '1' for CHANGE ID");
				System.out.println("Click '2' for CHANGE NAME");
				System.out.println("Click '3' for CHANGE CONTACT ");
				System.out.println("Click '4' for CHANGE BOOK ");
				System.out.println("Click '5' for CHANGE PRICE ");
				
				int choice=input.nextInt();
				
				switch (choice) {
				case 1: 
					System.out.print("Enter Costomer_Id: ");
					int id=input.nextInt();
					lms.setId(id);	
					
					
					break;
				
				case 2:
					input.nextLine();
					System.out.print("Enter Costomer_Name : ");
					String name=input.nextLine();
					lms.setName(name);
				
					break;
				
				case 3:
					System.out.print("Enter Costomer_PhnNo : ");
					long phnNo=input.nextLong();
					lms.setPhnNo(phnNo);
					
					break;
				
				case 4:
					System.out.print("Enter Book_Name : ");
					String book=input.next();
					lms.setBook(book);
				
					break;
					
				case 5:
					System.out.print("Enter price: ");
					double cost=input.nextDouble();
					lms.setCost(cost);
					
					break;
					
				case 0:{
					System.out.print("Enter Costomer_Id: ");
					int id1=input.nextInt();
					lms.setId(id1);
					input.nextLine();
					System.out.print("Enter Costomer_Name : ");
					String name1=input.nextLine();
					lms.setName(name1);
					System.out.print("Enter Costomer_PhnNo : ");
					long phnNo1=input.nextLong();
					lms.setPhnNo(phnNo1);
					System.out.print("Enter Book_Name : ");
					String book1=input.next();
					lms.setBook(book1);
					System.out.print("Enter price: ");
					double cost1=input.nextDouble();
					lms.setCost(cost1);
					
					lms =new libraryMS(id1, name1, phnNo1, name1, cost1);
					break;
				}
				default:
					
					System.out.println(" Incorrect option ");
			}
			}
			else if(key==3) {
				System.out.println(lms);
			}
			else if(key==0) {
				isWork=false;
				System.out.println(" Thank You ");
			}
			else
				System.out.println("Enter the Correct Option");


		}

		}

}
