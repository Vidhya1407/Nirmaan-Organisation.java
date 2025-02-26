package assesment;
//Write a java program to check given number is even or odd?

import java.util.Scanner;
public class JavaProgram4 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
        int number=sc.nextInt();
        if(number%2==0)
			System.out.println(number+" is Even Number ");
        else
			System.out.println(number+" is Odd Number ");
	}
}
