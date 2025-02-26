package assesment;
//Change given String into Capital and Small letters?

import java.util.Scanner;
public class JavaProgram5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		
		String Lower_Case=str.toLowerCase(); //convert to lowercase
		System.out.println("Lowercase  : "+Lower_Case);
		
		String Upper_Case=str.toUpperCase(); //convert to uppercase
		System.out.println("Uppercase  : "+Upper_Case);
    }
}
