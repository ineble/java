package y2022_06_03;

public class SportsCar extends Car {
	@Override
	public void SpeedUp() {
		speed += 10;
	}
	
	public final void stop1() {
		System.out.println("스포츠차를 멈춤");
		speed = 0;
	}
}
