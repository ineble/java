package y2022_06_15;


import java.io.FileWriter;
import java.io.Writer;

public class WriteExample6 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("E:/Temp/test7.text");
		
		char a= 'A';
		char b= 'B';
		char c= 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
	}

}
