package AnimalBehaviour;

public class Dog implements Animal{
	public void move() {
		System.out.println("The dog runs on four legs.");
	}
	@Override
	public void speak() {
		System.out.println("The dog says : Woof Woof!");
	}
	

}
