package assesment;
//Calculate total and average marks using Scanner?

import java.util.Scanner;
public class JavaProgram7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Subjects : ");
        int numOfSubject=sc.nextInt();
        int total_marks=0;
        double average_mark;
        //input marks for each subject
        for(int m=1;m<=numOfSubject;m++) {
    		System.out.println("Enter Mark for Subject"+m+" : ");
    		int mark=sc.nextInt();
    		total_marks +=mark;
        }
        average_mark=total_marks/numOfSubject;
        //output
		System.out.println("Enter the Total Marks : "+total_marks);
		System.out.println("Enter the Average Mark : "+average_mark);
	}
}
