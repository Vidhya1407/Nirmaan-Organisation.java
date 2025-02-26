package day6;
import java.util.Scanner;
public class Pattern10 {
	public static void main(String args[])
	{
	int i, j, n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values ");
	n = sc.nextInt();
	for (i = 1; i <= n; i++)
	{
	for (j = 1; j <= i; j++)
	System.out.print(" " + j);
	System.out.print("\n");
	}
	for (i = n - 1; i >= 1; i--)
	{
	for (j = 1; j <= i; j++)
	System.out.print(" " + j);
	System.out.print("\n");
	}
	}
}

/*	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1
*/
	

