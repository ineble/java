package sec04.exam05;

import java.util.Scanner;


public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner/*생성자*/(System.in);
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		}
	    System.out.println("종료");
	
	}
}

