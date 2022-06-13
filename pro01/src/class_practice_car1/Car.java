package class_practice_car1;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;

	Car() {

	}

	Car(String company, String model) {
		this(company, model, null, 0);
	}

	Car(String company, String model, String color) {
		this(company, model, color, 0);
	}
	
	Car(String company, int maxSpeed){
		this(company,null, null, maxSpeed);
	}
	Car(String company, String model, int maxSpeed){
		this(company, model, null, maxSpeed);
	}

	Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
