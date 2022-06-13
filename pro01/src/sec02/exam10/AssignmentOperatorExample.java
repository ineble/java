package sec02.exam10;

//클래스
public class AssignmentOperatorExample {
	// 메인 메소드
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result=" + result); //10
		result -= 5;
		System.out.println("result=" + result); //5
		result *= 3;
		System.out.println("result=" + result); //15
		result /= 3;
		System.out.println("result=" + result); //5
		result /= 3;
		System.out.println("result=" + result); //2
		
	}
}
