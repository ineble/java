package y2022_06_10;

import pra1.Car;

public class ClassExample {

	public static void main(String[] args) throws  Exception{
		// 1번째 방법 -> import 해야됨 -> 정적변수
		Class clazz1 = Car.class; 
		
		// 2번째 방법 -> 직접 패키지명과 클래스명을 넣어줌 -> 정적변수
		Class clazz2 = Class.forName("pra1.Car");

		// 3번째 방법 -> 인스턴스 멤버
		// 갖고온 클래스를 가지고 객체를 생성함
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println("================================");
		
		
		
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackage().getName());
		System.out.println("================================");
		
		
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackage().getName());
		System.out.println("================================");
	}

}
