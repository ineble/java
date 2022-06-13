package y2022_06_02;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("아반떼");
		Car yourCar = new Car("소나타");
		Car friendCar = new Car("제네시스");
		Car myCar2 = new Car("아우디");
		
		myCar.start();
		System.out.println();
		
		myCar.run();
		yourCar.run();
		friendCar.run();
		myCar2.run();
		
		myCar.win();
	}
}
