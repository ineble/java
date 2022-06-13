package sec04.verify.exam02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		String strNum1 = sc.nextLine();
		//enter치기전까지 수를 모두 변수 strNum1에 집어 넣겠다
		System.out.print("두번째 수: ");
		String strNum2 = sc.nextLine();
		//enter치기전까지 수를 모두 변수 strNum2에 집어 넣겠다
		
		int num1 = Integer.parseInt(strNum1);
		// String인 strNum1을 int인 num1로 형변환
		int num2 = Integer.parseInt(strNum2);
		// String인 strNum2을 int인 num2로 형변환
		int result = num1 + num2;
		// 숫자끼리의 합을 변수 result에 넣겠다
		System.out.println(result);
	}
}
