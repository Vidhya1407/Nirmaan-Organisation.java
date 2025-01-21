package day6;

public class Pattern20 {
	public static void main(String[] w) {
/*        1 
        2 2 2 
      3 3 3 3 3 
    4 4 4 4 4 4 4 
  5 5 5 5 5 5 5 5 5 
    4 4 4 4 4 4 4 
      3 3 3 3 3 
        2 2 2 
          1 

		int n=5;
		for(int i=1,p=1;i<n;i++,p++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print(p+" "); }
			for(int j=1;j<=i;j++) {
				System.out.print(p+" "); }
		System.out.println(); 
	    }
		for(int i=1,p=5;i<=n;i++,p--) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p+" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println();
		}
		}
//...........................................................
          1 
        2 2 2 
      3 3 3 3 3 
    4 4 4 4 4 4 4 
  5 5 5 5 5 5 5 5 5 
    6 6 6 6 6 6 6 
      7 7 7 7 7 
        8 8 8 
          9 

		int n=5,p=1;
		for(int i=1;i<n;i++,p++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print(p+" "); }
			for(int j=1;j<=i;j++) {
				System.out.print(p+" "); }
		System.out.println(); 
	    }
		for(int i=1;i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p+" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println();
		}
		}
//.............................................................................   
  1 2 3 4 5 6 7 8 9 
    1 2 3 4 5 6 7 
      1 2 3 4 5 
        1 2 3 
          1 
	
		int n=5;
		for(int i=1;i<=n;i++) {
			int p=1;//to initialise the column to print columnwise
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p++ +" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p++ +" "); }
		System.out.println(); }
		}
//..................................................................
  1 2 3 4 5 4 3 2 1 
    1 2 3 4 3 2 1 
      1 2 3 2 1 
        1 2 1 
          1 

		int n=5;
	for(int i=1;i<=n;i++) {
		int p=1;//to initialise the column to print columnwise
		for(int j=1;j<=i;j++) {
			System.out.print("  "); }
		for(int j=i;j<n;j++) {
			System.out.print(p++ +" "); }
		for(int j=i;j<=n;j++) {
			System.out.print(p-- +" "); }
	System.out.println(); }
	}
//..............................................................
           1 
        1 2 3 
      1 2 3 4 5 
    1 2 3 4 5 6 7 
  1 2 3 4 5 6 7 8 9 
    1 2 3 4 5 6 7 
      1 2 3 4 5 
        1 2 3 
          1 
      
	int n=5;
		for(int i=1;i<n;i++) {
				int p=1;
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print(p++ +" "); }
			for(int j=1;j<=i;j++) {
				System.out.print(p++ +" "); }
		System.out.println(); 
	    }
		for(int i=1;i<=n;i++) {
			int p=1;
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p+++" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p++ +" "); }
		System.out.println();
		}
		}
//..................................................................
           1 
        1 2 1 
      1 2 3 2 1 
    1 2 3 4 3 2 1 
  1 2 3 4 5 4 3 2 1 
    1 2 3 4 3 2 1 
      1 2 3 2 1 
        1 2 1 
          1 

		int n=5;
		for(int i=1;i<n;i++) {
				int p=1;
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print(p++ +" "); }
			for(int j=1;j<=i;j++) {
				System.out.print(p-- +" "); }
		System.out.println(); 
	    }
		for(int i=1;i<=n;i++) {
			int p=1;
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p+++" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p-- +" "); }
		System.out.println();
		}
		}
//................................................................
	      5 
        5 4 5 
      5 4 3 4 5 
    5 4 3 2 3 4 5 
  5 4 3 2 1 2 3 4 5 
    5 4 3 2 3 4 5 
      5 4 3 4 5 
        5 4 5 
          5 

		int n=5;
		for(int i=1;i<n;i++) {
				int p=n;
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print(p-- +" "); }
			for(int j=1;j<=i;j++) {
				System.out.print(p++ +" "); }
		System.out.println(); 
	    }
		for(int i=1;i<=n;i++) {
			int p=n;
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p--+" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p++ +" "); }
		System.out.println();
		}
		}
//................................................................
      
1                 1 
1 2             1 2 
1 2 3         1 2 3 
1 2 3 4     1 2 3 4 
1 2 3 4 5 1 2 3 4 5 
1 2 3 4     1 2 3 4 
1 2 3         1 2 3 
1 2             1 2 
1                 1 
      
      	 */

		int n=5;
		for(int i=1;i<n;i++) {
				
			for(int j=1;j<=i;j++) {
				System.out.print(j +" "); }
			for(int j=i;j<n;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print("  "); }
			for(int j=1,a=1;j<=i;j++,a++) {
				System.out.print(a +" "); }
			
		System.out.println(); 
	    }
		for(int i=1;i<=n;i++) {
			for(int j=i,p=1;j<=n;j++,p++) {
				System.out.print(p +" "); }
			for(int j=1;j<i;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print("  "); }
			for(int j=i,a=1;j<=n;j++,a++) {
				System.out.print(a +" "); }
			
			System.out.println();
		}
		}
//................................................................

 
}		