package exceptionHandling;

public class exceptionExampleProgram {

	public static void main(String[] args) {
		int a=50,b=0;
		int c;
		try {                     //If try block has Exception means ,it moves Catch block.
			c=a/b;
			System.out.println(c);
			System.out.println("try block.");
		}
		catch(Exception e) {      // we can create more than one catch blocks.
			System.err.println("Catch block 1: "+e);
		}
		finally {                 //Finally block should print,whether the try and catch block may or may not exist.
			System.out.println("\nFinally Block : "
					+ "Error verified.");
		}
		
	}
	//throw = It helps to create exceptin by Manually.
	//throws = It help to set checked exception when the user try to calling the method.
}
