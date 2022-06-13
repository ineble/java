package y2022_06_02;

public class Car {
	//필드
	String model;
	int speed;
	//생성자
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void start() {
		System.out.println("경주를 시작합니다.");
	} 
	
	
	
	void run() {
		for(int i = 10; i<=50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 :" + this.speed + "km/h)");
		}
		System.out.println("--------------------------------------------");
	}
	
	void win() {
		System.out.println(this.model + "이 승리하였습니다.");
	}
	
}
