package class_practice_car;
	
public class Car {
	String company = "현대자동차";//명시적 초기화
	String model; //생성자 초기화
	String color; //생성자 초기화
	int maxSpeed; //생성자 초기화
	
	//디폴트 생성자
	Car(){
	}
	// model 매개변수 
	Car(String model){
		this(model,null,0);
	}
	// model 매개변수, color 매개변수
	Car(String model,String color){
		this(model,color,0);
	}
	// model 매개변수, color 매개변수, maxSpeed 매개변수
	//this()사용시 이 부분이 가장 중요 기반이 되는 생성자가 되기때문에
	Car(String model,String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
