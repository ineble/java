package y2022_06_16;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("E:/Temp/test8.txt");
		char[] buffer = new char[100];
		
		while(true) {
			int readCharNum = reader.read(buffer); //65,66,67이 반복문에 따라 차례로 들어간다.
			System.out.println(readCharNum);
			if(readCharNum == -1) break;
			for(int i = 0 ; i <readCharNum; i ++) {
				System.out.println(buffer[i]);
			}
			
		}
		

		reader.close(); //통로 객체를 없애준다.
	}

}
