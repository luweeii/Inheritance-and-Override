
public class Main {
	
	public static void main(String[] args) {
		Car ToyotaVIOS = new Car();
		ToyotaVIOS.color = "Blue";
		ToyotaVIOS.price = 76599;
		ToyotaVIOS.speed = 69;
		
		System.out.println("Toyota Color: " + ToyotaVIOS.color);
		System.out.println("Toyota Price: " + ToyotaVIOS.price + "php");
		System.out.println("Toyota Speed: " + ToyotaVIOS.speed + "kph");
		System.out.println("Toyota Tire Type: " + ToyotaVIOS.tireType);
		ToyotaVIOS.drive();
		ToyotaVIOS.stop();
		
		System.out.println();//===================================================
		
		Plane U2SpyPlane = new Plane();
		U2SpyPlane.color = "White";
		U2SpyPlane.price = 183199.41;
		U2SpyPlane.speed = 254;
		
		System.out.println("U-2 Spy Plane Color: " + U2SpyPlane.color);
		System.out.println("U-2 Spy Plane Price: " + U2SpyPlane.price + "php");
		System.out.println("U-2 Spy Plane Speed: " + U2SpyPlane.speed + "kph");
		System.out.println("U-2 Spy Plane Wingspan: " + U2SpyPlane.wingspan);
		U2SpyPlane.fly();
		U2SpyPlane.stop();
		
		System.out.println();//===================================================
		
		Boat FandangoYacht = new Boat();
		FandangoYacht.color = "Gold";
		FandangoYacht.price = 8675899;
		FandangoYacht.speed = 40;
		
		System.out.println("Fandango Yacht Color: " + FandangoYacht.color);
		System.out.println("Fandango Yachtane Price: " + FandangoYacht.price + "php");
		System.out.println("Fandango Yacht Speed: " + FandangoYacht.speed + "kph");
		System.out.println("Fandango Yacht Wingspan: " + FandangoYacht.mainSailColor);
		FandangoYacht.Float();
		FandangoYacht.stop();
	}
}