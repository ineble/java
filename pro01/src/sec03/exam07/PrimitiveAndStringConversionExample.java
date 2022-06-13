package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		//Integer라는 클래스 속 parseInt라는 메소드 활용
		//parseInt는 문자열을 int로 바꿔주는 메소드
		int value1 = Integer.parseInt("10");
		//Double라는 클래스 속 parseDouble라는 메소드 활용
		//parseDouble는 문자열을 double로 바꿔주는 메소드
		double value2 = Double.parseDouble("3.14");
		//Boolean라는 클래스 속 parseBoolean라는 메소드 활용
		//parseBoolean는 문자열을 boolean로 바꿔주는 메소드
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		//String.valueOf() 메소드 사용하여 기본 타입을 문자열로 변환
		//int 10을 문자 String으로 변환
		String str1 = String.valueOf(10);
		//double 3.14을 문자 String으로 변환		
		String str2 = String.valueOf(3.14);
		//boolean true를 문자 String으로 변환
		String str3 = String.valueOf(true);
		
		
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
	    
	    
	}
}
