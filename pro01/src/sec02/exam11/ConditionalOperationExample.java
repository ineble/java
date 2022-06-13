package sec02.exam11;

//클래스
public class ConditionalOperationExample {
	// 메인 메소드
	public static void main(String[] args) {
		int score = 85;
//		String grade = (score > 90) ? "A" : ((score>80) ? "B" : "C");
//		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		String grade = "a";
		if(score > 90) {
			System.out.println("a");
		}else if (score > 80) {
			System.out.println("b");
			grade = "b";
		}else {
			System.out.println("c");
		}
		System.out.println("제 점수는" + score + "이고," + "제 등급은 " + grade + "입니다.");
	}
}
