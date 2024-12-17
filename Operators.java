package day1;

public class Operators {
public static void main(String[]a) {
	
	int num1=12;
	int num2=25;
	int num3=10;
	int num4=50;
	int num5=5;
	int num6=100;
	System.out.println("Enter the first number : "+num1);
	System.out.println("Enter the second number : "+num2);
	System.out.println("\nARITHMETIC OPERATIONS:");
	System.out.println("Addition : "+ (num1+num2));
	System.out.println("Subtraction : "+ (num1-num2));
	System.out.println("Multiplication : "+ (num1*num2));
	System.out.println("Division : "+ (num1/num2));
	System.out.println("Modulus : "+ (num1%num2));
	
	
	System.out.println("\nRELATIONAL OPERATIONS:");
	System.out.println(num1+" > "+num2+" : "+(num1>num2) );
	System.out.println(num1+" < "+num2+" : "+(num1<num2) );
	System.out.println(num1+" >= "+num2+" : "+(num1>=num2) );
	System.out.println(num1+" <= "+num2+" : "+(num1<=num2) );
	System.out.println(num1+" == "+num2+" : "+(num1==num2) );
	System.out.println(num1+" != "+num2+" : "+(num1!=num2) );
	
	System.out.println("\nLOGICAL OPERATIONS:");
	System.out.println("("+num1+" > "+num3+") AND"+"("+num2+" < "+num4+") : "+((num1>num3)&&(num2<num4)));
	System.out.println("("+num1+" < "+num5+") AND"+"("+num2+" > "+num6+") : "+((num1<num5)&&(num2>num6)));
	
	System.out.println("\nASSIGNMENT OPERATIONS:");
	int num=10;
	System.out.println("Initial value : "+num);
	System.out.println("After += "+(num +=12));
	System.out.println("After -= "+(num -=12));
	System.out.println("After *= "+(num *=12));
	System.out.println("After /= "+(num /=12));
	System.out.println("After %= "+(num %=12));
	
	System.out.println("\nUNARY OPERATIONS:");
	System.out.println("Initial value : "+ num1);
	System.out.println("After increment : "+ ++num1);
	System.out.println("After decrement : "+ --(num1));
	
	System.out.println("\nCONDITIONAL OPERATION:");
	String Ans=(num1%2==0)?" Even ":" Odd ";
	System.out.println(num1+" is "+Ans);
	
	
	
}
}
