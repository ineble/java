package pra1;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = Math.pow(10, 2)*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.printf("원의 넓이 : %.15f\n", result1);
		System.out.println("더하가 : " + result2);
		System.out.println("빼기 : " + result3);
	}

}
