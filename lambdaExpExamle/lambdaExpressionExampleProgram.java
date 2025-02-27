package lambdaExpExamle;

interface InterfaceA{
	void display();
}
public class lambdaExpressionExampleProgram {

	public static void main(String[] args) {
		
		InterfaceA object=()->System.out.println("In Display");
		object.display();

	}

}
