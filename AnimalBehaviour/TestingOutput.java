package AnimalBehaviour;

public class TestingOutput {

	public static void main(String[] args) {
		//create instances for both classe
		Dog d=new Dog(); 
		Bird b=new Bird();
		
		d.move();
		d.speak();
		
		b.move();
		b.speak();
		
		//calling static method
		System.out.println(Animal.isMammal("Dog"));
		System.out.println(Animal.isMammal("CAT"));
		System.out.println(Animal.isMammal("Gomathi"));
		System.out.println(Animal.isMammal("human"));
		System.out.println(Animal.isMammal("Bird"));

		
		//invoking a constant by using a class
	    System.out.println(Dog.CATEGORY);
	    System.out.println(Bird.CATEGORY);

	}

}
