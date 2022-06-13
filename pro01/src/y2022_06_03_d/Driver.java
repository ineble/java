package y2022_06_03_d;

public class Driver {
	//메소드
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	public void drive() {
		System.out.println("아무것도 달리지 않습니다.");
	}
	public void drive(String name) {
		System.out.println(name + "가 달립니다.");
	}
	public void drive(Human human) {
		human.run();
	}
}
