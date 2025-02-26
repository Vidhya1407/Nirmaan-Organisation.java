package day6;
//Rightsided decreasing trianglr
/*
   * * * * 
     * * *  -->increasing space & decreasing stars
       * *
         *  
 */
public class Pattern15 {
	public static void main(String[] x) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("  ");
		}
		for(int k=i;k<=n;k++) {
			System.out.print("* ");
		}
	
		System.out.println();
	}
	}
}
