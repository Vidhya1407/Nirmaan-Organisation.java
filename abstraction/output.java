package abstraction;

public class output {
		
		public static void main(String[] args) {
			dog d=new dog();
			cat c=new cat();
			cow cc=new cow();
			d.display();
			d.name="DOG";
			System.out.println("\n"+d.name);
			d.myName();
			d.sound();
			
			c.name="CAT";
			System.out.println("\n"+c.name);
		    c.myName();
			c.sound();
			
			c.name="COW";
			System.out.println("\n"+c.name);
			cc.myName();
			cc.sound();
			
		}
}


