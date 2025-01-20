package day11;

import java.util.Scanner;

public class VotingAge {
//method	
	boolean isvalid(int age) {
		if(age>=18 && age<=100)
			return true;
		else
			return false;
			}
//main method	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age : ");
		int input=sc.nextInt();
//create object to call the method(function)		
		VotingAge age=new VotingAge();
//calling method by using a object
		if (age.isvalid(input)) {
			System.out.println("you are eligible for voting ");
		}
		else
			System.out.println("you are not eligible for voting ");
				
	}

}
