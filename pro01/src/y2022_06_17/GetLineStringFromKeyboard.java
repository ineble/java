package y2022_06_17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in; //1바이트 단위로 받겠다.
		Reader reader = new InputStreamReader(is); //2다이트 단위를 받는 리더로 변환
		//보조 스트림
		BufferedReader br = new BufferedReader(reader); //버퍼에 모아서 사용하겠다.
		
		
		while(true) {
			System.out.print("입력하세요: ");
			String lineStr = br.readLine(); //라인 단위로 문자열을 읽겠다.
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
			System.out.print("입련된 내용 : " + lineStr);
			System.out.println();
			
		}
		
		br.close();

	}
}
