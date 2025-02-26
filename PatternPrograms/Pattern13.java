package day6;
//square pattern
public class Pattern13 {
	public static void main(String[] arr) {
		int num=5;
		for(int i=1;i<=num;i++)//row--> outer loop
			{
		   for(int j=1;j<=num;j++)//column-->inner loop
			   
			   {
			   System.out.print(" $ ");
		       }
		   System.out.println();
	}
}
//..............................................................		
	/* 	public static void main(String[] args) {
		  int c = 5;

	        for (int i = 1; i <=c; i++) {
	            for (int j = 1; j <= c; j++) {
	                System.out.print(j + " ");//"j" prints column
	            }
	            System.out.println();
	        }
	    } 
//..............................................................
	public static void main(String[] args) {
		  int r = 5;

	        for (int i = 1; i <=r; i++) {
	            for (int j = 1; j <=r; j++) {
	                System.out.print(i + " ");//"j" prints rows
	            }
	            System.out.println();
	        }
	    } 
	    */
}
