package assesment;
//How to reverse a given string ?

import java.util.Scanner;
public class JavaProgram10 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inputString=sc.nextLine();
		String reverseString="";
     
		for(int i=inputString.length()-1;i>=0;i--) {
	        reverseString +=inputString.charAt(i);
        }
		System.out.print("Reverse String  : "+reverseString);
    }
}
