package Interface;

public class calc implements calculator1,calculator2 {

	@Override
	public void mul(int a, int b) {
		System.out.println("MULTIPLICATION : "+(a+b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("DIVISION : "+(a+b));

		
	}

	@Override
	public void add(int a, int b) {
		System.out.println("ADDITION : "+(a+b));

		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("SUBTRACTION : "+(a+b));

		
	}
	public void display() {
		System.out.println("I print override default display method");
		
	}
	
		

	}


