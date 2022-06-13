package sec01.exam04;

//클래스
public class VariableScopeExample {
	// 메인 메소드
	public static void main(String[] args) {
		int v1 = 3;
		// if 중문
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10;
			int v3 = v1 + v2 + 5;
			System.out.println(v3);
		}else {
			int v2;
			v2 = v1 + 10;
			int v3 = v1 + v2 + 5;
			System.out.println(v3);
		}

	}

}
