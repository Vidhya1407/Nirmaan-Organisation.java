package assesment;
//Write a java program to print 1 to 100 such that every 4 multiples should be written as "Jack"?

public class JavaProgram2 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%4==0) {
				System.out.println("Jack");
				continue;
			}
			System.out.println(i);
		}
	}
}
