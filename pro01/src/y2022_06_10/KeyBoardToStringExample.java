package y2022_06_10;

import java.io.IOException;

public class KeyBoardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bs = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bs);
		
		String str = new String(bs, 0, readByteNo-2);
		System.out.println("출력 : " + str);
		

	}

}
