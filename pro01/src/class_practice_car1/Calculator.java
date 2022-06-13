package class_practice_car1;

import java.util.Scanner;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide (int result, int y) {
		double result1 = (double) result / y;
		return result1;
	}
	
	boolean check (){
		Scanner sc = new Scanner(System.in);
		System.out.println("계산을 그만하시려면 0을 눌러주세요");
		int num = sc.nextInt();
		
		if(num == 0) {
			return true;
		}
		return false;
	}
	
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
