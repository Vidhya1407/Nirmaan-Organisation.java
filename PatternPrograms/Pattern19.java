package day6;
public class Pattern19 {
	//NUMBER PATTERN PROGRAM
	//     *need to follow Pattern & Number 
	public static void main(String[] a) {
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5  		
		int n=5;
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//........................................................
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1
		int n=5;
		for(int i=1,p=5;i<=n;i++,p--) {
			for(int j=1;j<=i;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//..........................................................
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
		int n=5;
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//.........................................................	
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
	int n=5;
	for(int i=1,p=5;i<=n;i++,p--) {
		for(int j=i;j<=n;j++) {
			System.out.print(p+" "); }
	System.out.println(); }
	}
//.......................................................
1 1 1 1 1 
  2 2 2 2 
    3 3 3 
      4 4 
        5 
		int n=5;
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//.....................................................
	1 1 1 1 1 
     2 2 2 2 
      3 3 3 
       4 4 
        5
		int n=5;
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//.....................................................
5 5 5 5 5 
  4 4 4 4 
    3 3 3 
      2 2 
        1 
        
		int n=5;
		for(int i=1,p=5;i<=n;i++,p--) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//.....................................................
          1 
        2 2 2 
      3 3 3 3 3 
    4 4 4 4 4 4 4 
  5 5 5 5 5 5 5 5 5 

		int n=5;
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print(p+" "); }
			for(int j=1;j<=i;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//....................................................
          5 
        4 4 4 
      3 3 3 3 3 
    2 2 2 2 2 2 2 
  1 1 1 1 1 1 1 1 1
 
		int n=5;
		for(int i=1,p=5;i<=n;i++,p--) {
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print(p+" "); }
			for(int j=1;j<=i;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
     
//..................................................
  1 1 1 1 1 1 1 1 1 
    2 2 2 2 2 2 2 
      3 3 3 3 3 
        4 4 4 
          5 
          
		int n=5;
		for(int i=1,p=1;i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p+" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//.................................................
  5 5 5 5 5 5 5 5 5 
    4 4 4 4 4 4 4 
      3 3 3 3 3 
        2 2 2 
          1 
             
		int n=5;
		for(int i=1,p=5;i<=n;i++,p--) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p+" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//...................................................
          0 
        2 2 2 
      4 4 4 4 4 
    6 6 6 6 6 6 6 
  8 8 8 8 8 8 8 8 8 		
 
		int n=5;
		for(int i=1,p=0;i<=n;i++,p+=2) {
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				System.out.print(p+" "); }
			for(int j=1;j<=i;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//.................................................
  1 1 1 1 1 1 1 1 1 
    3 3 3 3 3 3 3 
      5 5 5 5 5 
        7 7 7 
          9
           
		int n=5;
		for(int i=1,p=1;i<=n;i++,p+=2) {
			for(int j=1;j<=i;j++) {
				System.out.print("  "); }
			for(int j=i;j<n;j++) {
				System.out.print(p+" "); }
			for(int j=i;j<=n;j++) {
				System.out.print(p+" "); }
		System.out.println(); }
		}
//...................................................
1 
2 2 
1 1 1       -->Pattern: increase triangle
2 2 2 2     -->Number: Rows(i) ODD=1 & EVEN=2
1 1 1 1 1 

		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("2 "); }
				else
	                System.out.print("1 "); 
			}
			System.out.println(); }
	}
//.......................................................
          $ 
        # # # 
      $ $ $ $ $ 
    # # # # # # # 
  $ $ $ $ $ $ $ $ $ 
  
  		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  "); }
			for(int j=1;j<i;j++) {
				if(i%2==0) {
					System.out.print("# "); }
				else
				    System.out.print("$ ");
				}
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("# "); }
				else
				    System.out.print("$ "); }
		System.out.println(); }
		}
//.................................................
  A A A A A 
    B B B B 
      A A A 
        B B 
          A 
          
     	int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				 System.out.print("  "); 
			}
			for(int j=i;j<=n;j++) {
				if(i%2==0) {
					System.out.print("B "); }
				else
					  System.out.print("A "); 
			}
			System.out.println(); }
	}
//................................................................
*/	
		
}
}