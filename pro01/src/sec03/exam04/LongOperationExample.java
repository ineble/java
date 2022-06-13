package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result2 = value1 + value2 + value3;
		//가장 큰 변수로 자동 형변환이 일어났다.
		System.out.println(result2);
	
	}
}
