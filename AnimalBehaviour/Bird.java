package AnimalBehaviour;

public class Bird implements Animal {
	public void move() {
		System.out.println("The bird flies in the sky.");
	}
	@Override
	public void speak() {
		System.out.println("The bird says : Chirp Chirp!");
	}
}
