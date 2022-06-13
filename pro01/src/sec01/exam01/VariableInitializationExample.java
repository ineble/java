package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// 총 메모리는 12바이트 value(4) + result(4) + 10(임시 4)
		int value = 40;
		int result = value + 10;
		System.out.println(result);
	}

}
