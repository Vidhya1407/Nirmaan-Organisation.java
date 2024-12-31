package day6;

public class reverse {
	public static void main(String[] r) {
		String name="Vidhya S";
		String rev=" ";
		
		for (int i=7;i>=0;i--) {
			rev+=name.charAt(i);
		}
		System.out.println(name);
		
		System.out.println("lowercase : "+rev.toLowerCase());
		System.out.println("Uppercase : "+rev.toUpperCase());
		
		String fruits[]= {"Banana","Apple","Papaya","Litchi"};
		for (int j=0;j<fruits.length;j++)
		{
			
			System.out.println((fruits[j]));
		}
	}

}
