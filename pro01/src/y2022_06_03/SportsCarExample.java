package y2022_06_03;

public class SportsCarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("차가 달립니다.");
		for(int i = 0; i < 10; i ++) {
			car1.SpeedUp();
			System.out.println("차의 속도 : " + car1.speed + "km/h");
		}
		car1.stop();
		
		SportsCar car2 = new SportsCar();
		
		System.out.println("차가 달립니다.");
		for(int i = 0; i < 10; i ++) {
			car2.SpeedUp();
			System.out.println("차의 속도 : " + car2.speed + "km/h");
		}
		car2.stop1();

	}
}
