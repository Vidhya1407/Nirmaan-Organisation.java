package inheritance;

public class UI_VMS {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle();
		v.startEngine();
		
		Car c=new Car();
		c.drive();
		
		ElectricCar ec=new ElectricCar();
		ec.chargeBattery();
		
		Bike b=new Bike();
		b.startEngine();
		b.kickStart();

	}

}
