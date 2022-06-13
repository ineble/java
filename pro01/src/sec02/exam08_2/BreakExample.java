package sec02.exam08_2;

//클래스
public class BreakExample {
	// 메인 메소드
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("시스템 종료");
	}
}
