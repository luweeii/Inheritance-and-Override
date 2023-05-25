
public class Plane extends Vehicle {
	int wingspan = 31;
	
	void fly() {
		System.out.println("Plane is flying");
	}
	
	@Override
	void stop() {
		System.out.println("Plane Stop");
		super.stop();
		
	}
}
