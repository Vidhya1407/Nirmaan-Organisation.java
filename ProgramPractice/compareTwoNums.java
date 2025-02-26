package ProgramPractice;
import java.util.Scanner;
public class compareTwoNums {
    public static void main(String[] args) {
    	System.out.println("Enter the Two Numbers : ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2)
			System.out.println(num1+" is greater than "+num2);
		else if(num1==num2)
			System.out.println(num1+" is equal to "+num2);
		else
			System.out.println(num1+" is lesser than "+num2);
}

}
