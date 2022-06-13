package sec02.verify.exam07;

import java.util.Scanner;

//클래스
public class Exam07 {
	// 메인 메소드
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택>");
		
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum) {
		case 1:
			System.out.println("예금액 : ");
			balance += Integer.parseInt(sc.nextLine());
			break;
		case 2:
			System.out.println("출금액 : ");
			balance -= Integer.parseInt(sc.nextLine());
			break;
		case 3:
			System.out.println("잔고 : ");
			System.out.println(balance);
			break;
		case 4:
			run = false;
			break;
		}
		System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
