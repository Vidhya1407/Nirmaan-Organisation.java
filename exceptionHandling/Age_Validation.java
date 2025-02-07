package exceptionHandling;

import java.util.Scanner;

public class Age_Validation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new Exception("Age should be greater than or equal to 18.");
			}
		}
		catch(Exception e) {
				System.out.println("Error Occured : "+e);
				System.out.println("You are not Eligible to Vote.");

			}
		finally {
			System.out.println("\nThank You.");
		}
		

	}

}
