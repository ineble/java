package y2022_06_16;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("E:/Temp/test7.txt");
		while(true) {
			int data = reader.read(); //65,66,67이 반복문에 따라 차례로 들어간다.
			if(data == -1) break;
			System.out.println(data);
			System.out.println((char)data);
		}

		reader.close(); //통로 객체를 없애준다.
	}

}
