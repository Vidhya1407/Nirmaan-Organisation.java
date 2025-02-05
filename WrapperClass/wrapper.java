package WrapperClass;

public class wrapper {
	public static void main(String[] args) {
		
		int num=14;
		Integer num1=num; //Autoboxing -->wrapper to primitive type
		int num2=num1;    //Unboxing --> primitive type to  wrapper
		
		System.out.println("Int Type : "+num);
		System.out.println("Auto boxing : "+num1);
		System.out.println("Unboxing : "+num2);
		
		char ch='V';
		Character ch1=ch; //Autoboxing -->wrapper to primitive type
		char ch2=ch1;    //Unboxing --> primitive type to  wrapper
		
		System.out.println("\nChar Type : "+ch);
		System.out.println("Auto boxing : "+ch1);
		System.out.println("Unboxing : "+ch2);
		
		float f=14.7f;
		Float f1=f; //Autoboxing -->wrapper to primitive type
		float f2=f1;    //Unboxing --> primitive type to  wrapper
		
		System.out.println("\nFloat Type : "+f);
		System.out.println("Auto boxing : "+f1);
		System.out.println("Unboxing : "+f2);
		
		double d=14.07d;
		Double d1=d; //Autoboxing -->wrapper to primitive type
		double d2=d1;    //Unboxing --> primitive type to  wrapper
		
		System.out.println("\nDouble Type : "+d);
		System.out.println("Auto boxing : "+d1);
		System.out.println("Unboxing : "+d2);
		
		short s=14;
		Short s1=s; //Autoboxing -->wrapper to primitive type
		short s2=s1;    //Unboxing --> primitive type to  wrapper
		
		System.out.println("\nShort Type : "+s);
		System.out.println("Auto boxing : "+s1);
		System.out.println("Unboxing : "+s2);
		
		byte b=14;
		Byte b1=b; //Autoboxing -->wrapper to primitive type
		byte b2=b1;    //Unboxing --> primitive type to  wrapper
		
		System.out.println("\nByte Type : "+b);
		System.out.println("Auto boxing : "+b1);
		System.out.println("Unboxing : "+b2);
		
		
		
	}

}
