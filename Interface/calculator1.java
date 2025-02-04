package Interface;

public interface calculator1 {
	int num=100;
	void add(int a,int b);
	void sub(int a,int b);
	
	static void display1() {
		System.out.println("I print Static display method");
	}
	
	default void display() {
		System.out.println("I print  default display method");
		
	}

}
interface calculator2{
	void mul(int a,int b);
	void div(int a,int b);
	
	
}


