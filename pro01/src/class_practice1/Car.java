package class_practice1;

public class Car {
	//직접 대딥하는 방식으로 초기화 필드값
	String company = "현대자동차";
	String model = "그랜져";
	int maxSpeed = 300;
	int productionYear;
	int currentSpeed;
	boolean engineStart;
	String color;
	int cc;
	//생성자
	Car(String color,int cc){
		this.color = color;
		this.cc = cc;
		
	}
}
