package class_practice1;

import java.util.Scanner;

public class CalExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cal cal = new Cal();
		System.out.println("정사각형의 길이를 정해주세요");
		int width = sc.nextInt();
		System.out.println("정사각형 넓이 : " +  cal.areaRectanble(width));
		System.out.println("직사각형의 높이를 정해주세요");
		int height = sc.nextInt();
		System.err.println("직사각형 넓이 : " +  cal.areaRectanble(width,height));
		

	}

}
