package class_practice_car1;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator myCal = new Calculator();
		myCal.powerOn();
		
		while(true) {
			System.out.println("더할 두 수를 입력해주세요");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int sum = myCal.plus(x, y);
			System.out.println("두 수의 합은 : " + sum + " 입니다.");
			
			if(myCal.check() == true) break;
			
			System.out.println("나누기를 할 수를 입력해주세요");
			int z = sc.nextInt();
			double result = myCal.divide(sum, z);
			
			System.out.println("합을 : "  + z +  "로 나눈 값은 : " + result + " 입니다.");
			if(myCal.check() == true) break;
			
			
		}
		
		myCal.powerOff();

	}

}
