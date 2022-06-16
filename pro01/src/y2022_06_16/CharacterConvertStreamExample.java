package y2022_06_16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다."); // 2바이트
		String data = read();
		System.out.println(data);

	}

	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("E:/Temp/test1.txt");
		// fos라는 매개변수안에 새 폴더를 1바이트를 쓰는 outputStream을 사용하여 객체 생성
		Writer writer = new OutputStreamWriter(fos);
		// writer라는 변수에 Writer객체로 형변환 느낌
		writer.write(str);
		// str을 써서 저장
		writer.flush();
		// 남은거 지우기
		writer.close();
		// 통로 닫기
	}

	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("E:/Temp/test1.txt");
		// fis는 inputStream
		Reader reader = new InputStreamReader(fis);
		// 변환
		char[] buffer = new char[100];
		// buffer로 받을 수 있는 공간 만들기
		int readCharNum = reader.read(buffer);
		// buffer안에 값을 넣고 그 크기를 반환
		reader.close();
		// 통로 닫기
		String data = new String(buffer, 0, readCharNum);
		// 0인덱스 부터 크기까지 버터에 넣어서 스트링 객체 생성
		return data;
		//객체 반환

	}

}
