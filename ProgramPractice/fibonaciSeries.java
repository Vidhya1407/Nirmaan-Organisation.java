package ProgramPractice;
import java.util.Scanner;
//fibonacci is Adding num recent previous of two.
public class fibonaciSeries {
	public static void main(String a[]) {
		System.out.print("Fibonacci Series upto ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		long nums[]=new long[limit];
		nums[0]=0;
		nums[1]=1;
		for (int n=2;n<limit;n++) {
			nums[n]=nums[n-1]+nums[n-2];
		}
		for(int i=0;i<limit;i++) {
			System.out.print(nums[i]+" ");
		
		}
	}

}
