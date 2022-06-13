package sec02.exam06_3;

//클래스
public class ArrayInArrayExample {
	// 메인 메소드
	public static void main(String[] args) {
		
		//수학점수 2행과 3열을 가진 고정 배열
		int [][] mathScores = new int[2][3];
		//외부 for문 행의 갯수만큼 진행
		for(int i =0;i < mathScores.length; i ++) {
			//내부 for문 i행이 가진 열의 갯수만큼 진행
			for(int k =0; k < mathScores[i].length; k ++) {
				// mathScore가 가진 각 행열의 점수를 표시
				System.out.println("mathScores[" + i + "][" + k + "] : " +  mathScores[i][k] );
			}
		}
		//영어점수 2행만을 가진 가변 배열
		int [][] englishScores = new int[2][];
		// 영어점수의 0행에 2개의 열을 추가;
		englishScores[0] = new int[2];
		// 영어점수의 1행에 3개의 열을 추가
		englishScores[1] = new int[3];
		// 외부 for문 행의 갯수만큼 반복
		for(int i =0;i < englishScores.length; i ++) {
			// 내부 for문 i행의 가진 열의 갯수만큼 진행
			for(int k =0; k < englishScores[i].length; k ++) {
				// 영어점수가 가진 각 행열의 점수를 표시
				System.out.println("englishScores[" + i + "][" + k + "] : " +  englishScores[i][k] );
			}
		}
		// 가변배열 각행과 열에 한번에 값을 집어넣는 방식
		// 자바 점수는 
		int[][] javaScores = {{95,80},{92,96,80}};
		for(int i =0;i < javaScores.length; i ++) {
			for(int k =0; k < javaScores[i].length; k ++) {
				System.out.println("javaScores[" + i + "][" + k + "] : " +  javaScores[i][k] );
			}
		}
		
		
	}

}
