package sec02.exam09_3;

//클래스
public class ArrayCopyExample {
	// 메인 메소드
	public static void main(String[] args) {
		String oldStrArray[] = { "java", "array", "copr" };
		String newStrArray[] = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, 1);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
} 
