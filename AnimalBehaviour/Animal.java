package AnimalBehaviour;

public interface Animal {
	String CATEGORY="Living Being"; //Constant
	
	static boolean  isMammal(String animalName) { //static method
		
		if (animalName.equalsIgnoreCase("Dog")||animalName.equalsIgnoreCase("Cat")||animalName.equalsIgnoreCase("Human"))
			return true;
		return false;
	}
	
	default void speak() {       //default method
		System.out.println("Animal is making a sound.");
	}
	
	void move();                 //abstract method
}
