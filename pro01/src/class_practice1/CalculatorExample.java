package class_practice1;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		cal.powerOn();
		while (true) {
			System.out.println("|1.더하기|2.빼기|3.곱하기|4.나누기|0.나가기|");
			System.out.println("무슨 계산을 원하십니까?");
			int num = sc.nextInt();
			if (num == 1) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double result = cal.plus(x, y);
				System.out.println("계산의 합은 : " + result);
			} else if (num == 2) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double result = cal.minus(x, y);
				System.out.println("계산의 합은 : " + result);
			} else if (num == 2) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double result = cal.minus(x, y);
				System.out.println("계산의 합은 : " + result);
			} else if (num == 3) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double result = cal.multi(x, y);
				System.out.println("계산의 합은 : " + result);
			} else if (num == 4) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double result = cal.divide(x, y);
				System.out.println("계산의 합은 : " + result);
			} else if (num == 0) {
				System.out.println("종료하겠습니다.");
				break;
			}

		}

		cal.powerOff();

	}

}
