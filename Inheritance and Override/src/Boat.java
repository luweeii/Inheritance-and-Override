
public class Boat extends Vehicle {
	String mainSailColor = "Black";
	
	void Float() {
		System.out.println("Boat is floating");
	}
	
	@Override
	void stop() {
		System.out.println("Boat stop");
		super.stop();
	}
}
