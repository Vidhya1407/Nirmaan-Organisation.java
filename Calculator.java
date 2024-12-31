package day8;

public class Calculator {
	int num1,num2;
	void add() {
		System.out.println("Addition = "+(num1+num2));
	}
	void sub() {
		System.out.println("Subtraction = "+(num1-num2));
	}
	void mul() {
		System.out.println("Multiplication = "+(num1*num2));
	}
    void div() {
    	System.out.println("Division = "+(num1/num2));
    }
    void mod() {
    	System.out.println("Modulus = "+(num1%num2));
    }
    public static void main (String[] calc) {
    	Calculator ex1=new Calculator();
    	ex1.num1=50;
    	ex1.num2=15;
    	System.out.println("Num1 = "+ex1.num1+"\nNum2 = "+ex1.num2);
    	ex1.add();
    	ex1.sub();
    	ex1.mul();
    	ex1.div();
    	ex1.mod();
    	System.out.println();
    	Calculator ex2=new Calculator();
        ex2.num1=40;
    	ex2.num2=12;
    	System.out.println("Num1 = "+ex2.num1+"\nNum2 = "+ex2.num2);
    	ex2.add();
    	ex2.sub();
    	ex2.mul();
    	ex2.div();
    	ex2.mod();
    	System.out.println();
    	Calculator ex3=new Calculator();
    	ex3.num1=20;
    	ex3.num2=5;
    	System.out.println("Num1 = "+ex3.num1+"\nNum2 = "+ex3.num2);
    	ex3.add();
    	ex3.sub();
    	ex3.mul();
    	ex3.div();
    	ex3.mod();
    	System.out.println();
    	Calculator ex4=new Calculator();
    	ex4.num1=100;
    	ex4.num2=50;
    	System.out.println("Num1 = "+ex4.num1+"\nNum2 = "+ex4.num2);
    	ex4.add();
    	ex4.sub();
    	ex4.mul();
    	ex4.div();
    	ex4.mod();
    	System.out.println();
    	Calculator ex5=new Calculator();
    	ex5.num1=82;
    	ex5.num2=13;
    	System.out.println("Num1 = "+ex5.num1+"\nNum2 = "+ex5.num2);
    	ex5.add();
    	ex5.sub();
    	ex5.mul();
    	ex5.div();
    	ex5.mod();
    	System.out.println();
    	
    	
    }
}
