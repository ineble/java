package y2022_06_15;


import java.io.FileWriter;
import java.io.Writer;

public class WriteExample7 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("E:/Temp/test10.text");
		
		String str = "ABC";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}

}
