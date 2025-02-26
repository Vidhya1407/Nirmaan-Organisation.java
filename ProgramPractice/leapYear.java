package ProgramPractice;
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		System.out.print("Enter a year : ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if( (year%400==0) ||((year%4==0) && (year%100!=0)) )
			System.out.println(year +" is a Leap Year");
		else
			System.out.println(year+" is not a Leap Year ");
	}

}
