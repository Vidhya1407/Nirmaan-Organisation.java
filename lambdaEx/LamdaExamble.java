package lambdaEx;
@FunctionalInterface
interface interface1{
	void display(String str);
}

public class LamdaExamble{

	public static void main(String[] args) {
		
		interface1 objectInterface1=(str)->System.out.println("Hi ,"+str);
		objectInterface1.display("I am Lamda .");

	}

}
