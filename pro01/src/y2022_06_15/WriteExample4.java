package y2022_06_15;


import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("E:/Temp/test9.text");
		
		char[] array = {'A','B','C','D','E'};
		
		writer.write(array,1,3);
		
		
		writer.flush();
		writer.close();
	}

}
