package sec02.exam10_2;

//클래스
public class ContinueExample {
	// 메인 메소드
	public static void main(String[] args) {
		System.out.println("=== 짝수 ===");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("=== 홀수 ===");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
