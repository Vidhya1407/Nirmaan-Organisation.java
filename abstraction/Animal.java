package abstraction;

public abstract class Animal {
	abstract void sound();//Declaration without using body
	abstract void  myName();
	String name;
	void display() { //concrete method 
		System.out.println("Hi, I am Animal ");
	}

}
class dog extends Animal{
	void myName() {
		System.out.println("I am a Dog");
	}
	void sound() {
		System.out.println("Dog barks....");
	}
	
}
class cat extends Animal{
	void sound() {
		System.out.println("Cat meows....");
	}
	void myName() {
		System.out.println("I am  a Cat");
	}
}
class cow extends Animal{
	void myName() {
		System.out.println("I am a Cow");
	}
	void sound() {
		System.out.println("cow Maaa....");
	}
}

 



