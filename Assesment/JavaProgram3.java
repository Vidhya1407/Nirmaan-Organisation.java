package assesment;
//Write a java program to skip odd numbers from 1 to 70?

public class JavaProgram3 {
	public static void main(String[] args) {
		for(int i=1;i<=70;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
