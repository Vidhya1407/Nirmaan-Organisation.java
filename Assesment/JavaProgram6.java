package assesment;
//Check if Student's Markis Pass or Fail ?

import java.util.Scanner;
public class JavaProgram6 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter your Mark : ");
	   int mark=sc.nextInt();
	   //defines the passing criteria
	   int passMark=35;
	   if(mark>=passMark) {
			System.out.println("You are Passed the Exam.");
	   }else
		   System.out.println("You are Failed the Exam. ");
	}
}
