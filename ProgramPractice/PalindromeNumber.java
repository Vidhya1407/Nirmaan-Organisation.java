package ProgramPractice;
import java.util.Scanner;
//If the given number is equal to its reverse number,then its called as PALINDROME.
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the size of array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt(); 
        int numbers[]=new int[size];
        System.out.println("Enter "+size+" elements :");
		for(int i=0;i<size;i++) {
        	numbers[i]=sc.nextInt();
         }
		System.out.println("\nThe  elements are....");
//foreach to display the elements.....
		for(int n:numbers) {
        	System.out.println(n);
		}
		System.out.println("\nTo check Palindrome or Not");

		for(int i=0;i<numbers.length;i++) {
			int reverse=0;
			int temp=0;
			int num=numbers[i];
			//Reverse Number
			while(num>0) {
				temp=num%10;
				num=num/10;
				reverse=reverse*10 +temp;
			}
			if (numbers[i]==reverse) {
				System.out.println(numbers[i]+" is a Palindrome ");
			}
		    else
				System.out.println(numbers[i]+" is not a Palindrome ");

				
			}
		}

}
