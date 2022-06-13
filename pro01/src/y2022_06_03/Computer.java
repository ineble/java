package y2022_06_03;

import java.lang.Override;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
	System.out.println("Computer 객체의 areCircle() 실행");
		return Math.PI * r * r;
	}
}
