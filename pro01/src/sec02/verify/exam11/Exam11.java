package sec02.verify.exam11;

import java.util.Scanner;

//클래스
public class Exam11 {
	// 메인 메소드
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("아이디:"); String name = sc.nextLine();
		 * 
		 * System.out.println("패스워드:"); String strpassword = sc.nextLine();
		 * 
		 * int password = Integer.parseInt(strpassword); // 삼항연산자 버전 
		 * String str1 = (name.equals("java")) ? (password == 12345) ? "로그인 성공" : "로그인 실패:패스워드가 틀림" :
		 * "로그인 실패 : 아이디가 존재하지 않음"; System.out.println(str1);
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("아이디:");
			String name = sc.nextLine();

			System.out.println("패스워드:");
			String strpassword = sc.nextLine();

			int password = Integer.parseInt(strpassword);

			if (name.equals("java")) {
				if (password == 12345) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패:패스워드가 틀림");

				}
			} else {
				System.out.println("로그인 실패 : 아이디가 존재하지 않음");
			}
		}
	}
}
