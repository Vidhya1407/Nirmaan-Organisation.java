package lambdaExpExamle;

interface Interface1{
	int add(int a,int b);
}

public class lambdaExpressionExampleProgram2 {

	public static void main(String[] args) {
		
		Interface1 object=(a,b)-> a+b;
		
        System.out.println(object.add(100,100));
       

	}

}
