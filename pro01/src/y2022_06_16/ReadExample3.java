package y2022_06_16;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("E:/Temp/test9.txt");
		char[] buffer = new char[5];
		
		int reachCharNum = reader.read(buffer,2,3);
		System.out.println(reachCharNum);
		if(reachCharNum != -1) {
			
			for(int i = 0; i<buffer.length;i++) {
				System.out.println(buffer[i]);
				
			}
			System.out.println(buffer.length);
		}
		

		reader.close(); //통로 객체를 없애준다.
	}

}
