package sec06.exam06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		//setSpeed 메소드 speed가 0이하이면 speed의 값을 0으로 만들고 종료 시킴
		myCar.setSpeed(-50); //speed = 0
		System.out.println("현재 속도 : " +  myCar.getSpeed() + "km/h");
		//setSpeed 메소드 speed가 0이상이면 speed에 매개변수값을 대입함
		myCar.setSpeed(60); //speed = 60
		System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");
		// isStop 메소드 논리 값 stop을 반환시키는 메소드
		if(!myCar.isStop()) {
			// setStop 논리값 변수인 stop에 매개변수를 받아 대입시키고 speed에 0을 대입
			myCar.setStop(true); // speed = 0
		}
		System.out.println("현재 속도 : " + myCar.getSpeed() + "km/h");
	}
}
