package assesment;
//Write a java program to cast vote if age is greater than 18?

import java.util.Scanner;
public class JavaProgram1 {
		public static void main(String[] args) {
			System.out.println("Enter Age : ");
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			
			if(age>=18 && age<=100) {
				System.out.println("You are Eligible to Vote. ");
			}
			else
				System.out.println("You are Not Eligible to Vote. ");
		}
}