package y2022_06_16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("E:/songjiseop/pro01/src/y2022_06_16/language.txt");
		
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
			
		}
		
		br.close();

	}

}
