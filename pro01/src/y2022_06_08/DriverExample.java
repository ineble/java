package y2022_06_08;

public class DriverExample {

	public static void main(String[] args) {
		// Driver 메소드를 실행하기위하여 만든 참조변수
		Driver driver = new Driver();
		
		//매개변수 자리에 넣기위하여 만든 참조 변수 값이 객체인 이유는 메소드의 매개변수가 객체이기때문에
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
