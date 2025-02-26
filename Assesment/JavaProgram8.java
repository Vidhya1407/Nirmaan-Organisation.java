package assesment;
//Write a java program to check given year is leap year or not ?

import java.util.Scanner;
public class JavaProgram8 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a Year : ");
        int year=sc.nextInt();
        
        if((year%400==0) || (year%4==0)&&(year%100!=0)) {
    		System.out.println(year+" is a Leap year.");
        }else
    		System.out.println(year+" is not a Leap year.");
	}
}
