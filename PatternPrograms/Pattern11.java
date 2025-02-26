package day6;
import java.util.Scanner;
public class Pattern11 {
	public static void main(String args[])
	{
	int i, j, k, n, a;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n values");
	n = sc.nextInt();
	a = n;
	for (i = 1; i <= n; i++)
	{
	for (j = a; j > 1; j--)
	{
	System.out.print(" ");
	}
	for (k = i; k != 0; k--)
	{
	System.out.print(k);
	}
	a--;
	for (int l = 2; l <= i; l++)
	{
	System.out.print(l);
	}
	System.out.println();
	}
	}
}
	
	
	
/*	 1
	212
	32123
	4321234
	543212345
*/
