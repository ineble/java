package y2022_06_03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		// 여기서 만든 calculator은 자식 클래스를 걸쳐 부모 클래스까지 올라간다.
		// 자식클래스에서 없기떄문에
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		Computer computer = new Computer();
		// 여기서 만든 computer은 자식 클래스를 참고한다.
		System.out.println("원면적 : " + computer.areaCircle(r));

	}

}
