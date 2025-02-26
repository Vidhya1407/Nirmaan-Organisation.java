package ProgramPractice;
import java.util.Scanner;
public class isPrime {

	public static void main(String[] args) {
		System.out.print("Enter the limit : ");
        Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		System.out.println("Prime Numbers between 1 to "+limit);
		for(int i=1;i<=limit;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
				
			}
		    if(isPrime)
				System.out.print(i+" ");

			}
		


	}

}
