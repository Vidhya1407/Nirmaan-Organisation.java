package day6;
//Reverse Hill Pattern
/*
 * * * * * * *
   * * * * *      -->Increasing space,Decreasing Star & Decreasing Star
     * * *
       * 
 */
public class Pattern17 {
	public static void main(String[] s) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int k=i;k<=n-1;k++) {
				System.out.print("* "); }
			for(int l=i;l<=n;l++) {
			    System.out.print("* "); }
		System.out.println();
		}
}
	
	}