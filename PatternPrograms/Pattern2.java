package day6;

public class Pattern2 {
//Decreasing Triangle Pattern
	public static void main(String[] arr) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
