package day6;
//Diamond Pattern
public class Pattern18 {
	public static void main(String[] b) {
		int n=5;
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("   ");//decresing space
			}
			for(int k=1;k<i;k++) {
				System.out.print(" * ");//increasing star
			}
			for(int l=1;l<=i;l++) {
				System.out.print(" * ");//increasing star
			}
			System.out.println();
		}for(int i=1;i<=n;i++) {
			for(int m=1;m<=i;m++) {
				System.out.print("   ");//increasing space
			}
			for(int o=i;o<n;o++) {
				System.out.print(" * ");//decreasing star
			}
			for(int p=i;p<=n;p++) {
				System.out.print(" * ");//deceasing star
			}
			System.out.println();
		}
	}

}
