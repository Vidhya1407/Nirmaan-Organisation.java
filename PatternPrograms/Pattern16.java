package day6;
//Hill Pattern
/*      * 
      * * *       -->Decrese space,Increase star & Incresa Star    
    * * * * *
  * * * * * * *
 */
public class Pattern16 {
	public static void main(String[] r) {
		int n=8;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("   ");
			}for(int k=1;k<i;k++) {
				System.out.print(" * ");
			}for(int l=1;l<=i;l++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
