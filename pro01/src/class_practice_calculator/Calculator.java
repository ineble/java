package class_practice_calculator;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void printf(String message, double result) {
		System.out.printf("%s%.2f",message,result);
	}
	
	void execute() {
		double result = (double)avg(7,10);
		String message = "실행 결과 : ";
		printf(message,result);
	}
	
}
