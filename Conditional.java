package day3;
import java.util.Scanner;
public class Conditional {
	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark :");
		int m=sc.nextInt();
		if(m>=35 && m<=100) {
			System.out.println("PASS");
			
			if(m>=90) {
				System.out.println(" A ");
			}
			else if(m>=80){
				System.out.println(" B ");
			}
			else if(m>=70){
				System.out.println(" C ");
			}
			else if(m>=60){
				System.out.println(" D ");
			}
			else if(m>=50){
				System.out.println(" E ");
			}
			else{
				System.out.println(" NO GRADE ");
			}}
		else if(m>100) {
			System.out.println("Invalid mark ");}
		else
				System.out.println(" FAIL ");
	}*/
		System.out.println(" ENTER YOUR CHOISE ");
		System.out.println(" 1 for ADDITION ");
		System.out.println(" 2 for SUBTRACTION");
		System.out.println(" 3 for MULTIPLICATION");
		System.out.println(" 4 for DIVISION ");
		System.out.println(" 5 for MODULUS ");
		
		Scanner sc=new Scanner (System.in);
		System.out.println("\nChoose any one\n ");
		int input=sc.nextInt();
		
		switch (input) {
		case 1: {
			System.out.println("Enter num1 : ");
			int num1=sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2=sc.nextInt();
			System.out.println("Add : "+(num1+num2));
			break;
		}
		case 2: {
			System.out.println("Enter num1 : ");
			int num1=sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2=sc.nextInt();
			System.out.println("Sub : "+(num1-num2));
			break;
		}
		case 3: {
			System.out.println("Enter num1 : ");
			int num1=sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2=sc.nextInt();
			System.out.println("Mul : "+(num1*num2));
			break;
		}
		case 4: {
			System.out.println("Enter num1 : ");
			int num1=sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2=sc.nextInt();
			System.out.println("Div : "+(num1/num2));
			break;
		}
		case 5: {
			System.out.println("Enter num1 : ");
			int num1=sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2=sc.nextInt();
			System.out.println("Mod : "+(num1%num2));
			break;
		}
		default:
			System.out.println("Invalid choice ");
		}
		
}}