package y2022_06_10;

public class ExitExample {

	public static void main(String[] args) {
		//반복문 for while do-while
		for(int i = 0;i<10;i++) {
			if(i == 5) {
				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("마무리 코드");
		// 마무리 코드가 안 뜨는 이유는 jvm(java virtual machine 자체를 빠져나왔기때문이다.)
	}
}
