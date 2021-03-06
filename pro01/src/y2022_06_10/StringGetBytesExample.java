package y2022_06_10;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		//UTF-16비트를 다른 인코딩 타입으로 바꿔준다.
		//즉 이건 UTF-16이다
		System.out.println("bytes1.length : " + bytes1.length);
		System.out.println("bytes1.original " + bytes1);
		String str1 = new String(bytes1);
		
		System.out.println("bytes1->String : " + str1);
		
		try {
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println("bytes2.length : " + bytes2.length);
		System.out.println("bytes2.original " + bytes2);
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("bytes2->String : " + str2);
		
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println("bytes3.length : " + bytes3.length);
		System.out.println("bytes3.original " + bytes3);
		String str3 = new String(bytes3, "UTF-8");
		System.out.println("bytes3->String : " + str3);
		
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		

	}

}
