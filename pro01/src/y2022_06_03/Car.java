package y2022_06_03;

public class Car {
	public int speed;
	public void SpeedUp() {
		speed += 1;
	}
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
