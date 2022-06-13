package sec02.exam01_3;

//클래스
public class ArrayCreateByValueListExample1 {
	// 메인 메소드
	public static void main(String[] args) {
		int score[] = {83,90,87};
		for(int i = 0; i < 3; i ++) {
		System.out.println("score[" + i + "] : " + score[i]);
		}
	int sum = 0;
	for(int j =0; j<3; j ++) {
		sum += score[j];
	}
		System.out.println("총합 : " + sum);
		double avg = (double)sum /3;
		System.out.println("평균 : " +avg);
	}
}

