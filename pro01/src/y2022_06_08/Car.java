package y2022_06_08;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backtLeftTire = new HankookTire();
	Tire backrightTire = new HankookTire();
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backtLeftTire.roll();
		backrightTire.roll();
		
	}
}
