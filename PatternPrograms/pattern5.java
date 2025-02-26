package day6;

public class pattern5 {
	public static void main(String[] args) {
		  int rows = 6;

	        for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i+ " ");
	            }
	            System.out.println();
	        }
	    }     
}