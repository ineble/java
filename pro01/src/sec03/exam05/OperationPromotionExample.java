package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;

		// 자동 형변환 int로
		int intValue1 = bytevalue1 + bytevalue2;
		System.out.println(intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;

		// 역시나 자동 현변환 int로
		int intValue2 = charValue1 + charValue2;

		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char) intValue2);

		int intValue3 = 10;
		// int로 자동형변환 되어 짤림
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);

		int intValue5 = 10;
		// 4.0의 타입이 double이니깐 double로 자동 형변환
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);

		int x = 1;
		int y = 2;

		// 타입 중 하나가 double 이니깐 double로 자동 형변환
		double result = (double) x / y;
		System.out.println(result);

	}
}
