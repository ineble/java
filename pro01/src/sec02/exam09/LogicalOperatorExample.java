package sec02.exam09;

//클래스
public class LogicalOperatorExample {
	// 메인 메소드
	public static void main(String[] args) {
	int charCode = 'A';
	int value = 6;
	
	if((charCode>=65)& (charCode<=90)) {
	
		System.out.println("대문자 이군요!");
	}
	if((charCode>=97)&& (charCode<=122)) {
		System.out.println("소문자 이군요!");
	}
	if(!(charCode<48)&& !(charCode>57)) {
		System.out.println("0~9 숫자 이시군요!");
	}
	
	if((value%2 == 0) | (value%3 == 0)) {
		System.out.println("2 또는 3의 배수 이군요!");
	}
	if((value%2 == 0) || (value %3 == 0)) {
		System.out.println("2 또는 3의 배수 이군요!");
	}
	}
}
