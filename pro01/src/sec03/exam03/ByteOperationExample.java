package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20; //리터럴 상수 
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y; //여기서 promotion이 일어난다.
		System.out.println(result2);
	}
}
