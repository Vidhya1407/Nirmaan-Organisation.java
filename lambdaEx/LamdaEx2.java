package lambdaEx;

interface interface2{
	int addition(int a,int b);
}
public class LamdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface2 obj=(a,b)->a+b;
		System.out.println("Sum : "+obj.addition(100, 120));
		int c=obj.addition(1000, 120);
        System.out.println(c);
	}

}
