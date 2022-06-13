package y2022_06_03_d;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();

		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Human human = new Human("철수");
		Human human1 = new Human("민수");
		Human human2 = new Human("영희");
		
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(human);
		driver.drive(human1);
		driver.drive(human2);
		driver.drive();
	}
}
