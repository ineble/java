package class_practice1;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	double plus(double x, double y) {
		double result = x + y;
		return result;
	}
	
	double divide(double x, double y) {
		double result = (double)(x/y);
		return result;
	}
	
	double multi(double x, double y) {
		double result = (double)(x*y);
		return result;
	}
	double minus(double x, double y) {
		double result  = x-y;
		return result;
	}
	
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
