package sec02.exam07_2;

//클래스
public class WhileSumFrom1To100Example {
	// 메인 메소드
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while (i <= 100);
		System.out.println("1~" + (i - 1) + "합 : " + sum);
	}
}
