package day6;
//Floyd Triangle
public class Pattern6 {
	
	 public static void main(String[] args) {
	        int rows = 5, number = 1;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(number + " ");
	                number++;
	            }
	            System.out.println();
	        }
	    }
	}