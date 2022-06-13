package y2022_06_03_d;

public class Car1Example {

	public static void main(String[] args) {
		Car1 car = new Car1();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); //car는 변수명일 뿐이다 실상은 객체가 run을 실행한다.
			// run을 실행하면 if()안의 조건식을 하기위하여 tire안의 roll 메소드로간다.
			// roll메소드의 반환값인 정수를 PL에 저장시킨다.
			switch (problemLocation) {
			// 선택문인 switch()안의 숫자 변수 자리에 PL을 넣는다.
			case 1:
				// PL이 1일때
				System.out.println("앞 왼쪽 HanKookTire로 교체");
				//로테이션과 새 타이어의 수명
				// car의 부모타입인 tire형의 바퀴수명이 0이되면 자식 타입인 한국 타이어로 초기화를 한다.
				// 이게 가능한 이유 한국 타이어(자식) 타이어(부모)의 상속읃 받았고,
				// 자동 형변환에 의해 한국 타이어가 타이어로 프로모션되었다.
				// car 객체 안의 참조변수 필드는 tire형이고 이에 한국타이어를 대입연산자로 넣으니 프로모션된다.
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); 
				break;
			case 2:
				// PL이 2일때
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞왼쪽", 13);
				break;
			case 3:
				// PL이 3일때
				System.out.println("뒤 왼쪽 HanKookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				// PL이 4일때
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 13);
				break;

			}
			System.out.println("-------------------------------------------------------");
		}

	}

}
