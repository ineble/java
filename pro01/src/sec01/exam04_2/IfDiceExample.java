package sec01.exam04_2;

//클래스
public class IfDiceExample {
	// 메인 메소드
	public static void main(String[] args) {
		for(int i = 0; i < 6; i ++) {
		int num = (int)(Math.random()*6+1);
		
		
		if(num == 1) {
			System.out.println(num + "번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println(num + "번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println(num + "번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println(num + "번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println(num + "번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
	}
	}
}
