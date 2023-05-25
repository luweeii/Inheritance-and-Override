
public class Car extends Vehicle {

	String tireType = "Gulong";
	
	void drive() {
		System.out.println("Car is driving");
	}
	
	@Override
	void stop() {
		System.out.println("Car Stop");
		super.stop();
	}
}
