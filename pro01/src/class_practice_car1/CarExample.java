package class_practice_car1;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println("----------------------------------");
		Car car2 = new Car("삼성자동차","그랜져");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println("----------------------------------");
		Car car3 = new Car("기아자동차","소나타","검정색");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println("----------------------------------");
		
		Car car4 = new Car("현대자동차",250);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println("----------------------------------");
		Car car5 = new Car("도요타","모닝",250);
		System.out.println("car5.company : " + car5.company);
		System.out.println("car5.model : " + car5.model);
		System.out.println("car5.color : " + car5.color);
		System.out.println("car5.maxSpeed : " + car5.maxSpeed);
		System.out.println("----------------------------------");
		
		Car car6 = new Car("람보르기니","아벤타도르","노란색",300);
		System.out.println("car6.company : " + car6.company);
		System.out.println("car6.model : " + car6.model);
		System.out.println("car6.color : " + car6.color);
		System.out.println("car6.maxSpeed : " + car6.maxSpeed);

		
	}
}
