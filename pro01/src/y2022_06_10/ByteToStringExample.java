package y2022_06_10;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte [] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		
		
		String str1 = new String(bytes);
		// 여기서 String 생성자는 bytes배열에 담긴 숫자를 아스키디코더로 변환하여 한 글자씩 인덱스에 저장해준다.
		
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
		// 여기서 String 생성자는 처음 시작하는 인덱스 6 에서 4개의 숫자를 저장해준다.
		System.out.println(str2);
		
		
		
		
	}

}
