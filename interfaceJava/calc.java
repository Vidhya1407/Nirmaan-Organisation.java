package interfaceJava;

public class calc implements Calculator{

	@Override
	public  void add(int a, int b) {
		System.out.println("Addition of "+a+" and " +b+" is "+(a+b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("\nSubtraction of "+a+" and " +b+" is "+(a-b));
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("\nMultiplication  of "+a+" and " +b+" is "+(a*b));

	}

	@Override
	public void div(int a, int b) {
		System.out.println("\nDivision of "+a+" and " +b+" is "+(a/b));

	}

	@Override
	public void mod(int a, int b) {
		System.out.println("\nModulus of "+a+" and " +b+" is "+(a%b));

	}

}
