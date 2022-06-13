package sec02.exam08_1;

public class ComparOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //int가 double로 pormotion		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //소수점 자릿수 차이로
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
	}
}
