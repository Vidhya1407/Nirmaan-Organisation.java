package assesment;
//Remove Vowels in the paragraph ?

import java.util.Scanner;
public class JavaProgram9 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a paragh : ");
    	String str=sc.nextLine();
    	StringBuilder ans=new StringBuilder(); //StringBuilder helps to store the result
    	for(char ch:str.toCharArray()) {
    		switch(ch) {
    		case 'a':
    		case 'A':
    		case 'e':
    		case 'E':
    		case 'i':
    		case 'I':
    		case 'o':
    		case 'O':
    		case 'u':
    		case 'U':
    			break;
    	    default:
    	    	ans.append(ch);
    		}
    	}
        	System.out.println("Paragraph without vowels : "+ans);
    }

}
