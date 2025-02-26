package ProgramPractice;
import java.util.Scanner;
public class facorialOfNumber {

	public static void main(String[] args) {
		System.out.print("Enter a Number to check its Factorial : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=num;
		for(int i=(num-1);i>=1;i--) {
			fact=fact*i;}
		
			System.out.print("The factorial of "+num+"! is "+fact);
		}

	}


