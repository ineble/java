package y2022_06_10;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		//indexOf는 찾는 문자열의 갯수가 없으면 -1을 반환 
		//만약 있으면 첫 번째 문자가 시작되는 인덱스의 갯수가 반환됨
		System.out.println(location);
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
			
		}else {
			System.out.println("자바와 관련없는 책이군요.");
		}

	}

}
