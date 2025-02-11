package BankManagementSystem;

import java.util.Scanner;

public class UI_BankService {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank bank=new Bank();
		boolean isWork=true; 
		System.out.println("SINGLE BANK ACCOUNT MANAGEMENT SYSTEM  ");
		
		while(isWork) {
			System.out.println("\nEnter your Choice\n ");
			System.out.println("Click '1' for ADD an amount in Balance");
			System.out.println("Click '2' for WITHDRAW an amount in  Balance");
			System.out.println("Click '3' for SHOW  the Bank details");
			System.out.println("Click '0' for EXIT ");
			System.out.print("\nEnter the Option : ");
			int key=sc.nextInt();
			
			System.out.print("Enter your Pin : ");
			int pin=sc.nextInt();
			if(bank.getPin()==pin) {
				if(key==1) {
					System.out.print("Enter the amount to Add in current Balance :");
					double amt=sc.nextDouble();
					bank.setBalance(bank.getBalance()+amt);
				}
				else if(key==2) {
					System.out.print("Enter amount to Withdraw : ");
					double amt=sc.nextDouble();
					if(bank.getBalance()>=amt) {
						bank.setBalance(bank.getBalance()-amt);
					}
					else
						System.out.println("Invalid Amount ");
				}
				else if(key==3) {
					System.out.println(bank);
				}
				else if (key==0) {
					System.out.println(" ............THANK YOU........... ");
					isWork=false;
					
				}
				else {
					System.out.println("....Invalid Option....");
				}
			}
			else {
				System.out.println("Invalid pin");
			}
		}

	}

}
