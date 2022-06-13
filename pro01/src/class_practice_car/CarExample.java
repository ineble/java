package class_practice_car;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1의 회사 : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2의 회사 : " + car2.company);
		System.out.println("car2의 모델 : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용","빨강");
		System.out.println("car3의 회사 : " + car3.company);
		System.out.println("car3의 모델 : " + car3.model);
		System.out.println("car3의 색깔 : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시","검정", 200);
		System.out.println("car4의 회사 : " + car4.company);
		System.out.println("car4의 모델 : " + car4.model);
		System.out.println("car4의 색깔 : " + car4.color);
		System.out.println("car4의 최고속도 : " + car4.maxSpeed);
		System.out.println();
	}
}
